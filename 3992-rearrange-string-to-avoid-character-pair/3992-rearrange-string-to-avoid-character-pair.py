class Solution:
    def rearrangeString(self, s: str, x: str, y: str) -> str:
        cnt_x = s.count(x)
        cnt_y = s.count(y)
        
        # if one of them doesn't exist, condition is already true
        if cnt_x == 0 or cnt_y == 0:
            return s
            
        others = []
        for c in s:
            if c != x and c != y:
                others.append(c)
        
        # y... other... x... -> every y before every x
        t = y * cnt_y + "".join(others) + x * cnt_x
        return t
