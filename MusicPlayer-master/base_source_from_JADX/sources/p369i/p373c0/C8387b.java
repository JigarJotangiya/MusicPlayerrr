package p369i.p373c0;

import java.util.NoSuchElementException;
import p369i.p377u.C8495y;

/* renamed from: i.c0.b */
/* compiled from: ProgressionIterators.kt */
public final class C8387b extends C8495y {

    /* renamed from: g */
    private final int f34874g;

    /* renamed from: h */
    private boolean f34875h;

    /* renamed from: i */
    private int f34876i;

    /* renamed from: j */
    private final int f34877j;

    public C8387b(int i, int i2, int i3) {
        this.f34877j = i3;
        this.f34874g = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f34875h = z;
        this.f34876i = !z ? i2 : i;
    }

    /* renamed from: b */
    public int mo30365b() {
        int i = this.f34876i;
        if (i != this.f34874g) {
            this.f34876i = this.f34877j + i;
        } else if (this.f34875h) {
            this.f34875h = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f34875h;
    }
}
