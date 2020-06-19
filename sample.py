

# 計算クラス
class Calculator:

    def __init__(self, num: int) -> None:
        # 初期化処理
        self.__num = num

    def add(self, add_num: int) -> "Calculator":
        # 加算処理
        new_num = self.__num + add_num
        return Calculator(new_num)

    def sub(self, add_num: int) -> "Calculator":
        # 減算処理
        new_num = self.__num - add_num
        return Calculator(new_num)

    def mul(self, add_num: int) -> "Calculator":
        # 乗算処理
        new_num = self.__num * add_num
        return Calculator(new_num)

    def div(self, add_num: int) -> "Calculator":
        # 除算処理
        new_num = self.__num / add_num
        new_num = int(new_num)
        return Calculator(new_num)

    def rem(self, add_num: int) -> "Calculator":
        # 剰余算処理
        new_num = self.__num % add_num
        return Calculator(new_num)

    def equals(self) -> int:
        # 結果表示
        return self.__num


# テストケース

if __name__ == "__main__":
    # 使用例1:
    value = Calculator(1).add(5).equals()
    print(value)  # 6

    # 使用例2:
    value = Calculator(5).sub(1).equals()
    print(value)  # 4

    # 使用例3:
    value = Calculator(5).mul(5).equals()
    print(value)  # 25

    # 使用例4:
    value = Calculator(20).div(5).equals()
    print(value)  # 4

    # 使用例5:
    value = Calculator(5).rem(5).equals()
    print(value)  # 0

    # 使用例6:
    value = Calculator(5).add(5).sub(3).equals()
    print(value)  # 7

    # 使用例7:
    value = Calculator(15).sub(5).div(3).equals()
    print(value)  # 5
