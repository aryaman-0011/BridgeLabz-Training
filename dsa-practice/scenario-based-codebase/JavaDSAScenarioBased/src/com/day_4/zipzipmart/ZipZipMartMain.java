/*
3. ZipZipMart – Daily Sales Summary Report (Merge Sort)
Story: ZipZipMart compiles thousands of daily sales records from all branches. To generate
reports, the system sorts transactions by date and amount using Merge Sort, which ensures
stability and efficiency with large datasets.
Key Concepts:
● Divide and conquer
● Large-scale sorting
● Preserves order of equal items (stable)
*/

package com.day_4.zipzipmart;

public class ZipZipMartMain {

    public static void main(String[] args) {

        Sale[] sales = {
            new Sale("2026-01-15", 500.0, "Delhi", 101),
            new Sale("2026-01-14", 300.0, "Mumbai", 102),
            new Sale("2026-01-15", 500.0, "Pune", 103),
            new Sale("2026-01-13", 700.0, "Chennai", 104),
            new Sale("2026-01-14", 300.0, "Bangalore", 105)
        };

        System.out.println("📌 Sales Before Sorting:\n");
        for (Sale s : sales) {
            s.display();
        }

        MergeSortUtil.mergeSort(sales, 0, sales.length - 1);

        System.out.println("\n📌 Sales After Sorting (Date → Amount):\n");
        for (Sale s : sales) {
            s.display();
        }
    }
}
