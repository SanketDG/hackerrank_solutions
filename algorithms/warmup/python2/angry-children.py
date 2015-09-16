def merge(left, right):
    result = []
    left_idx, right_idx = 0, 0
    while left_idx < len(left) and right_idx < len(right):
        # change the direction of this comparison to change the direction of
        # the sort
        if left[left_idx] <= right[right_idx]:
            result.append(left[left_idx])
            left_idx += 1
        else:
            result.append(right[right_idx])
            right_idx += 1

    if left:
        result.extend(left[left_idx:])
    if right:
        result.extend(right[right_idx:])
    return result


def merge_sort(m):
    if len(m) <= 1:
        return m

    middle = len(m) // 2
    left = m[:middle]
    right = m[middle:]

    left = merge_sort(left)
    right = merge_sort(right)
    return list(merge(left, right))

n = int(raw_input())
k = int(raw_input())
candies = [input() for _ in range(0, n)]
candies = merge_sort(candies)
unfairness = 100000000000000000000
for i in range(n - k + 1):
    diff = candies[k+i-1] - candies[i]

    if (diff < unfairness):
        unfairness = diff

print unfairness