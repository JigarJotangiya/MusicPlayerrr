package p159f.p160a.p161a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;

/* renamed from: f.a.a.e */
/* compiled from: GravityEnum */
public enum C4267e {
    START,
    CENTER,
    END;
    

    /* renamed from: g */
    private static final boolean f12732g = false;

    /* renamed from: f.a.a.e$a */
    /* compiled from: GravityEnum */
    static /* synthetic */ class C4268a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12734a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                f.a.a.e[] r0 = p159f.p160a.p161a.C4267e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12734a = r0
                f.a.a.e r1 = p159f.p160a.p161a.C4267e.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12734a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.a.a.e r1 = p159f.p160a.p161a.C4267e.CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12734a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.a.a.e r1 = p159f.p160a.p161a.C4267e.END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p160a.p161a.C4267e.C4268a.<clinit>():void");
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public int getGravityInt() {
        int i = C4268a.f12734a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return f12732g ? 8388613 : 5;
            }
            throw new IllegalStateException("Invalid gravity constant");
        } else if (f12732g) {
            return 8388611;
        } else {
            return 3;
        }
    }

    @TargetApi(17)
    public int getTextAlignment() {
        int i = C4268a.f12734a[ordinal()];
        if (i != 2) {
            return i != 3 ? 5 : 6;
        }
        return 4;
    }
}
