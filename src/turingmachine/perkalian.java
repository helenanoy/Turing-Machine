package turingmachine;

public class perkalian {

    static void multi(int angka1, int angka2) {
        String stringInput = "";
        String state = "q0";
        int curr = 0;
        for (int i = 0; i < angka1; i++) {
            stringInput = stringInput + "0";
        }
        stringInput = stringInput + "1";
        for (int i = 0; i < angka2; i++) {
            stringInput = stringInput + "0";
        }
        stringInput = stringInput + "1";
        stringInput = stringInput + "B" + "B" + "B" + "B" + "B" + "B" + "B" + "B";
        StringBuilder input = new StringBuilder(stringInput);

        System.out.print("\n\nInput : ");
        System.out.println(input);

        while (true) {
            if (state == "q0") {
                if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, 'B');
                    curr++;
                    state = "q1";
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, 'B');
                    curr++;
                    state = "q7";
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                }else {
                    break;
                }
            } else if (state == "q1") {
                if (input.charAt(curr) == '0') {
                    curr++;
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr++;
                    state = "q2";
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                } else {
                    break;
                }
            } else if (state == "q2") {
                if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, 'X');
                    curr++;
                    state = "q3";
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr--;
                    state = "q5";
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                } else {
                    break;
                }
            } else if (state == "q3") {
                if (input.charAt(curr) == '1') {
                    curr++;
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                } else if (input.charAt(curr) == '0') {
                    curr++;
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                } else if (input.charAt(curr) == 'B') {
                    input.setCharAt(curr, '0');
                    curr--;
                    state = "q4";
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                } else {
                    break;
                }
            } else if (state == "q4") {
                if (input.charAt(curr) == '0') {
                    curr--;
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                } else if (input.charAt(curr) == '1') {
                    curr--;
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                } else if (input.charAt(curr) == 'X') {
                    input.setCharAt(curr, 'X');
                    curr++;
                    state = "q2";
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                }
                else {
                    break;
                }
            } else if (state == "q5") {
                if (input.charAt(curr) == 'X') {
                    input.setCharAt(curr, '0');
                    curr--;
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, '1');
                    curr--;
                    state = "q6";
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                } else {
                    break;
                }
            } else if (state == "q6") {
                if (input.charAt(curr) == '0') {
                    curr--;
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                } else if (input.charAt(curr) == 'B') {
                    input.setCharAt(curr, 'B');
                    curr++;
                    state = "q0";
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                } else {
                    break;
                }
            } else if (state == "q7") {
                if (input.charAt(curr) == '0') {
                    input.setCharAt(curr, 'B');
                    curr++;
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                } else if (input.charAt(curr) == '1') {
                    input.setCharAt(curr, 'B');
                    curr++;
                    state = "q8";
                    System.out.println("\nState: " + state + ", Input : " + input + ", Index : " + curr
                            + ", Ditunjuk : " + input.charAt(curr));
                } else {
                    break;
                }
            } else if (state == "q8") {
                System.out.print("\nHasil : ");
                System.out.println(input);
                System.out.println();
                break;
            }
        }
    }
}
