class Solution:
    def shortestAlternatingPaths(self, num_nodes, red_edges, blue_edges):
        # Create a graph with 2 lists for each node, 
        # representing red and blue edges
        graph = [[[], []] for i in range(num_nodes)]
        
        for red_start, red_end in red_edges:
            graph[red_start][0].append(red_end)
            
        for blue_start, blue_end in blue_edges:
            graph[blue_start][1].append(blue_end)
        
        # Initialize the result array with values representing infinite distance
        result = [[0, 0]] + [[num_nodes * 2, num_nodes * 2] for i in range(num_nodes - 1)]
        
        # Initialize the bfs queue with starting node 0 and color 0 and 1
        bfs = [[0, 0], [0, 1]]
        
        # Start the BFS traversal
        for node, color in bfs:
            for next_node in graph[node][color]:
                if result[next_node][color] == num_nodes * 2:
                    result[next_node][color] = result[node][1 - color] + 1
                    bfs.append([next_node, 1 - color])
        
        # Return the minimum distance between node 0 and all other nodes, 
        # or -1 if not possible
        return [x if x < num_nodes * 2 else -1 for x in map(min, result)]