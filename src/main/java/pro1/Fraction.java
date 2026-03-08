package pro1;

public class Fraction {
    private long n, d;

    public Fraction(long n, long d) {
        if (d == 0) throw new IllegalArgumentException("Jmenovatel nemůže být nula.");
        long g = NumericUtils.gcd(n, d);
        n /= g;
        d /= g;
        if (d < 0) { n = -n; d = -d; }
        this.n = n;
        this.d = d;
    }

    @Override
    public String toString() {
        return n + "/" + d;
    }

    public Fraction add(Fraction other) {
        long num = this.n * other.d + other.n * this.d;
        long denom = this.d * other.d;
        return new Fraction(num, denom);
    }

    public static Fraction parse(String s) {
        String[] items = s.split("\\+");
        Fraction sum = new Fraction(0,1);

        for (String item : items) {
            item = item.trim();
            Fraction f;
            if (item.endsWith("%")) {
                int percent = Integer.parseInt(item.replace("%",""));
                f = new Fraction(percent, 100);
            } else if (item.contains("/")) {
                String[] frac = item.split("/");
                long n = Long.parseLong(frac[0].trim());
                long d = Long.parseLong(frac[1].trim());
                f = new Fraction(n, d);
            } else {
                continue;
            }
            sum = sum.add(f);
        }
        return sum;
    }
}
