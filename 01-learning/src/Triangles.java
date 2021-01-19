public class Triangles {

    public static void main(String[] args) {

        int[][] triangles = {{3, 4, 5}, {2, 10, 8}, {5, 6, 5}, {5, 5, 5}};

        for (int[] a : triangles) {
            System.out.print("Triangle: " + a[0] + "," + a[1] + "," + a[2]);

            if (a[0] < a[1] + a[2] && a[1] < a[0] + a[2] && a[2] < a[0] + a[1]) {
                System.out.print(" possible");

                if (a[0] == a[1] && a[0] == a[2]) {
                    System.out.print(" equilateral,");
                } else if (a[0] == a[1] || a[1] == a[2] || a[0] == a[2]) {
                    System.out.print(" isosceles,");
                } else {
                    System.out.print(" scalene,");
                }

                double halfPerimeter = (a[0] + a[1] + a[2]) / 2.0;
                double area = Math.sqrt(halfPerimeter * (halfPerimeter - a[0]) * (halfPerimeter - a[1]) * (halfPerimeter - a[2]));
                area = Math.round(area * 100.0) / 100.0;
                System.out.println(" area = " + area);

            } else {
                System.out.println(" impossible");
            }
        }

    }

}
