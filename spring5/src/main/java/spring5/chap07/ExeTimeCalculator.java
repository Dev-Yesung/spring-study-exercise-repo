package spring5.chap07;

public class ExeTimeCalculator implements Calculator {

    private final Calculator delegate;

    public ExeTimeCalculator(Calculator delegate) {
        this.delegate = delegate;
    }

    @Override
    public long factorial(long num) {
        long start = System.nanoTime();
        long result = delegate.factorial(num);
        long end = System.nanoTime();

        System.out.printf("%s.factorial(%d) 실행 시간 = %d\n",
                          delegate.getClass().getSimpleName(),
                          num, end - start);

        return result;
    }
}
