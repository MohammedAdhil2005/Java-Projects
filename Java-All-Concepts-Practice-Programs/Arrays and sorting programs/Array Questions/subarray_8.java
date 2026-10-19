class subarray_8 {
    public static void main(String[] args) {

        int[] a= {1, 2, 3};
        int k = 3;
        int count = 0;

        for (int i = 0; i < a.length; i++) {

            int sum = 0;

            for (int j = i; j < a.length; j++) {

                sum =sum+a[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        System.out.println("Count = " + count);
    }
}