import unittest


class CompareLists:
    def compare_lists(list1, list2):
        average1 = sum(list1) / len(list1)
        average2 = sum(list2) / len(list2)

        if average1 > average2:
            return "Первый список имеет большее среднее значение"
        elif average2 > average1:
            return "Второй список имеет большее среднее значение"
        else:
            return "Средние значения равны"



class TestCompareLists(unittest.TestCase):
    def test_compare_lists(self):
        list1 = [1, 2, 3, 4, 5]
        list2 = [6, 7, 8, 9, 10]
        result = compare_lists(list1, list2)
        self.assertEqual(result, "Второй список имеет большее среднее значение")

        list1 = ['new', 2, 3.0]
        list2 = ['new', 2, 3.0]
        result = compare_lists(list1, list2)
        # Python сравнивает последовательности по индексам и значениям
        self.assertEqual(result, "Средние значения равны")

        list1 = [10, 20]