package p159f.p243f.p327d.p329b;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import p159f.p243f.p327d.p328a.C7656e;

/* renamed from: f.f.d.b.x */
/* compiled from: CollectSpliterators */
final class C7731x {

    /* renamed from: f.f.d.b.x$a */
    /* compiled from: CollectSpliterators */
    class C7732a implements Spliterator<OutElementT> {

        /* renamed from: a */
        final /* synthetic */ Spliterator f33089a;

        /* renamed from: b */
        final /* synthetic */ Function f33090b;

        C7732a(Spliterator spliterator, Function function) {
            this.f33089a = spliterator;
            this.f33090b = function;
        }

        public int characteristics() {
            return this.f33089a.characteristics() & -262;
        }

        public long estimateSize() {
            return this.f33089a.estimateSize();
        }

        public void forEachRemaining(Consumer<? super OutElementT> consumer) {
            this.f33089a.forEachRemaining(new C7674f(consumer, this.f33090b));
        }

        public boolean tryAdvance(Consumer<? super OutElementT> consumer) {
            return this.f33089a.tryAdvance(new C7680g(consumer, this.f33090b));
        }

        public Spliterator<OutElementT> trySplit() {
            Spliterator trySplit = this.f33089a.trySplit();
            if (trySplit != null) {
                return C7731x.m42607b(trySplit, this.f33090b);
            }
            return null;
        }
    }

    /* renamed from: f.f.d.b.x$b */
    /* compiled from: CollectSpliterators */
    static abstract class C7733b<InElementT, OutElementT, OutSpliteratorT extends Spliterator<OutElementT>> implements Spliterator<OutElementT> {

        /* renamed from: a */
        OutSpliteratorT f33091a;

        /* renamed from: b */
        final Spliterator<InElementT> f33092b;

        /* renamed from: c */
        final Function<? super InElementT, OutSpliteratorT> f33093c;

        /* renamed from: d */
        final C7734a<InElementT, OutSpliteratorT> f33094d;

        /* renamed from: e */
        int f33095e;

        /* renamed from: f */
        long f33096f;

        @FunctionalInterface
        /* renamed from: f.f.d.b.x$b$a */
        /* compiled from: CollectSpliterators */
        interface C7734a<InElementT, OutSpliteratorT extends Spliterator<?>> {
            /* renamed from: a */
            OutSpliteratorT mo28739a(OutSpliteratorT outspliteratort, Spliterator<InElementT> spliterator, Function<? super InElementT, OutSpliteratorT> function, int i, long j);
        }

        C7733b(OutSpliteratorT outspliteratort, Spliterator<InElementT> spliterator, Function<? super InElementT, OutSpliteratorT> function, C7734a<InElementT, OutSpliteratorT> aVar, int i, long j) {
            this.f33091a = outspliteratort;
            this.f33092b = spliterator;
            this.f33093c = function;
            this.f33094d = aVar;
            this.f33095e = i;
            this.f33096f = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void mo28933b(Consumer consumer, Object obj) {
            Spliterator spliterator = (Spliterator) this.f33093c.apply(obj);
            if (spliterator != null) {
                spliterator.forEachRemaining(consumer);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void mo28935d(Object obj) {
            this.f33091a = (Spliterator) this.f33093c.apply(obj);
        }

        public final int characteristics() {
            return this.f33095e;
        }

        public final long estimateSize() {
            OutSpliteratorT outspliteratort = this.f33091a;
            if (outspliteratort != null) {
                this.f33096f = Math.max(this.f33096f, outspliteratort.estimateSize());
            }
            return Math.max(this.f33096f, 0);
        }

        public final void forEachRemaining(Consumer<? super OutElementT> consumer) {
            OutSpliteratorT outspliteratort = this.f33091a;
            if (outspliteratort != null) {
                outspliteratort.forEachRemaining(consumer);
                this.f33091a = null;
            }
            this.f33092b.forEachRemaining(new C7682h(this, consumer));
            this.f33096f = 0;
        }

        public final boolean tryAdvance(Consumer<? super OutElementT> consumer) {
            do {
                OutSpliteratorT outspliteratort = this.f33091a;
                if (outspliteratort == null || !outspliteratort.tryAdvance(consumer)) {
                    this.f33091a = null;
                } else {
                    long j = this.f33096f;
                    if (j == Long.MAX_VALUE) {
                        return true;
                    }
                    this.f33096f = j - 1;
                    return true;
                }
            } while (this.f33092b.tryAdvance(new C7685i(this)));
            return false;
        }

        public final OutSpliteratorT trySplit() {
            Spliterator<InElementT> trySplit = this.f33092b.trySplit();
            if (trySplit != null) {
                int i = this.f33095e & -65;
                long estimateSize = estimateSize();
                if (estimateSize < Long.MAX_VALUE) {
                    estimateSize /= 2;
                    this.f33096f -= estimateSize;
                    this.f33095e = i;
                }
                OutSpliteratorT a = this.f33094d.mo28739a(this.f33091a, trySplit, this.f33093c, i, estimateSize);
                this.f33091a = null;
                return a;
            }
            OutSpliteratorT outspliteratort = this.f33091a;
            if (outspliteratort == null) {
                return null;
            }
            this.f33091a = null;
            return outspliteratort;
        }
    }

    /* renamed from: f.f.d.b.x$c */
    /* compiled from: CollectSpliterators */
    static final class C7735c<InElementT, OutElementT> extends C7733b<InElementT, OutElementT, Spliterator<OutElementT>> {
        C7735c(Spliterator<OutElementT> spliterator, Spliterator<InElementT> spliterator2, Function<? super InElementT, Spliterator<OutElementT>> function, int i, long j) {
            super(spliterator, spliterator2, function, C7702q.f33046a, i, j);
        }
    }

    /* renamed from: a */
    static <InElementT, OutElementT> Spliterator<OutElementT> m42606a(Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator<OutElementT>> function, int i, long j) {
        boolean z = true;
        C7656e.m42491b((i & 16384) == 0, "flatMap does not support SUBSIZED characteristic");
        if ((i & 4) != 0) {
            z = false;
        }
        C7656e.m42491b(z, "flatMap does not support SORTED characteristic");
        C7656e.m42492c(spliterator);
        C7656e.m42492c(function);
        return new C7735c((Spliterator) null, spliterator, function, i, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public static <InElementT, OutElementT> Spliterator<OutElementT> m42607b(Spliterator<InElementT> spliterator, Function<? super InElementT, ? extends OutElementT> function) {
        C7656e.m42492c(spliterator);
        C7656e.m42492c(function);
        return new C7732a(spliterator, function);
    }
}
