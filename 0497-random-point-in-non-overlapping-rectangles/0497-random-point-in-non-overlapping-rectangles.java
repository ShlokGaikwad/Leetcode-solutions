class Solution {
	private static final Random random = new Random();
	private final TreeMap<Integer, Integer> map = new TreeMap<>();
	private final int[][] rects;
	private final int totalPoints;

	/**
	 * Initializes the object with the given rectangles rects
	 */
	public Solution(int[][] rects) {
		this.rects = rects;
		var j = 0;
		var points = 0;

		for (var rect : rects) {
			var numOfPoints = (rect[2] - rect[0] + 1) * (rect[3] - rect[1] + 1);
			points += numOfPoints;
			map.put(points, j++);
		}

		totalPoints = points;
	}

	/**
	 * @return a random integer point [u, v] inside the space covered by one of the given rectangles
	 */
	public int[] pick() {
		var points = (int) (random.nextDouble() * totalPoints);
		var i = map.higherEntry(points).getValue();
		var rect = rects[i];
		var x = random.nextInt(rect[0], rect[2] + 1);
		var y = random.nextInt(rect[1], rect[3] + 1);
		return new int[]{x, y};
	}
}