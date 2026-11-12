
class Solution:
    def letterCombinations(self, digits: str) -> list[str]:
        if not digits:
            return []

        mp = {
            "2": "abc", "3": "def", "4": "ghi",
            "5": "jkl", "6": "mno", "7": "pqrs",
            "8": "tuv", "9": "wxyz"
        }

        st = ""
        ans = []
        self.fun(0, st, digits, mp, ans)
        return ans

    def fun(self, i, st, digits, mp, ans):
        if len(st) == len(digits):
            ans.append(st)
            return

        ele = mp[digits[i]]

        for ch in ele:
            self.fun(i + 1, st + ch, digits, mp, ans)
