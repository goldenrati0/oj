class Solution:
    def removeDuplicateLetters(self, s):
        """
        :type s: str
        :rtype: str
        """
        if s == "" or len(s) == 1:
            return s # single or empty string niye kichu korar nai
        
        counter = collections.Counter(s) # count korbe, kon character kotobar ache
        
        stack: typing.List[str] = list()
        visited_characters: typing.Set = set()
        
        for character in s:
            counter[character] -= 1 # everytime visit korle counter will be decreased by 1
            
            if character in visited_characters:
                continue # visited er moddhe thaka maane eita already add kora ache, so ignore and go to next character
                
            if stack == [] and len(visited_characters) == 0:
                stack.append(character)
                visited_characters.add(character)
                continue # stack and set duitai empty, so eita push kore dicchi
                
            # stack_top: str = stack[-1] # stack er top element
            # stack_top_counter: int = counter[stack_top] # top element er count
            
            while stack != [] and stack[-1] > character and counter[stack[-1]] > 0:
                visited_characters.remove(stack.pop()) # current character er theke lexicographically choto character stack e na pawa porjonto set and stack dui jaiga thekei stack_top character remove korte thakbo until I hit the bottom of the stack
                
                # if stack == []:
                    # continue # pop korar pore stack empty hoye gele do not proceed further in while loop
                # new values assign kore dicchi to evaluate the while loop in correct manner
                # stack_top = stack[-1] # stack er top element
                # stack_top_counter = counter[stack_top] # top element er count
            
            # current character stack and set dui jaiga tei insert kore dibo
            visited_characters.add(character)
            stack.append(character)
        
        # stack er moddhe jeita thakbe sheitai result
        return "".join(stack)