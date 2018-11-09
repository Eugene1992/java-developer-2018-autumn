package java_professional.builder;

public class SomeClass {
    private String a; // required
    private String b; // required
    private String c;
    private String d;
    private String e;
    private String f;

    static class SomeClassBuilder {
        private String a; // required
        private String b; // required
        private String c;
        private String d;
        private String e;
        private String f;

        public SomeClassBuilder(String a, String b) {
            this.a = a;
            this.b = b;
        }

        public SomeClassBuilder c(String c) {
            this.c = c;
            return this;
        }

        public SomeClassBuilder d(String d) {
            this.d = d;
            return this;
        }

        public SomeClassBuilder e(String e) {
            this.e = e;
            return this;
        }

        public SomeClassBuilder f(String f) {
            this.f = f;
            return this;
        }

        public SomeClass build() {
            return new SomeClass(this);
        }
    }

    private SomeClass(SomeClassBuilder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
    }

    public static void main(String[] args) {
        SomeClass build = new SomeClassBuilder("a", "b")
                .c("c")
                .d("d")
                .e("e")
                .build();
    }
}
