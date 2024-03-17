package com.rkfcheung.leetcode

/*
847. Shortest Path Visiting All Nodes https://leetcode.com/problems/shortest-path-visiting-all-nodes/
 */
class ShortestPathVisitingAllNodes {
    fun shortestPathLength(graph: Array<IntArray>): Int {
        graph.print()
        val n = graph.size
        val targetState = (1 shl n) - 1
        val queue = ArrayDeque<Pair<Int, Int>>()
        val visited = Array(n) { BooleanArray(1 shl n) }

        repeat(n) { i ->
            val state = 1 shl i
            queue.add(Pair(i, state))
            visited[i][state] = true
        }

        var steps = 0
        while (queue.isNotEmpty()) {
            val size = queue.size
            repeat(size) {
                val (node, state) = queue.removeFirst()
                if (state == targetState) {
                    return steps
                }

                graph[node].forEach { neighbor ->
                    val nextState = state or (1 shl neighbor)
                    if (!visited[neighbor][nextState]) {
                        visited[neighbor][nextState] = true
                        queue.add(Pair(neighbor, nextState))
                    }
                }
            }

            steps++
        }

        return -1
    }

    private fun Array<IntArray>.print() {
        println(this.map { it.contentToString() })
    }
}