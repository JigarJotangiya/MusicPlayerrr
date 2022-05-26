package p342g.p343a.p344a.p345b;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: g.a.a.b.b */
/* compiled from: FlipAnimation */
public class C7945b extends Animation {

    /* renamed from: g */
    private final float f33670g;

    /* renamed from: h */
    private final float f33671h;

    /* renamed from: i */
    private final float f33672i;

    /* renamed from: j */
    private final float f33673j;

    /* renamed from: k */
    private Camera f33674k;

    /* renamed from: l */
    private int f33675l;

    /* renamed from: m */
    private final C7947b f33676m;

    /* renamed from: n */
    private float f33677n;

    /* renamed from: g.a.a.b.b$a */
    /* compiled from: FlipAnimation */
    static /* synthetic */ class C7946a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33678a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                g.a.a.b.b$b[] r0 = p342g.p343a.p344a.p345b.C7945b.C7947b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33678a = r0
                g.a.a.b.b$b r1 = p342g.p343a.p344a.p345b.C7945b.C7947b.SCALE_UP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33678a     // Catch:{ NoSuchFieldError -> 0x001d }
                g.a.a.b.b$b r1 = p342g.p343a.p344a.p345b.C7945b.C7947b.SCALE_DOWN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33678a     // Catch:{ NoSuchFieldError -> 0x0028 }
                g.a.a.b.b$b r1 = p342g.p343a.p344a.p345b.C7945b.C7947b.SCALE_CYCLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p342g.p343a.p344a.p345b.C7945b.C7946a.<clinit>():void");
        }
    }

    /* renamed from: g.a.a.b.b$b */
    /* compiled from: FlipAnimation */
    public enum C7947b {
        SCALE_UP,
        SCALE_DOWN,
        SCALE_CYCLE,
        SCALE_NONE;

        public float getScale(float f, float f2) {
            float f3;
            float f4;
            int i = C7946a.f33678a[ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    f4 = 1.0f - f;
                } else if (i != 3) {
                    return 1.0f;
                } else {
                    if (((double) f2) <= 0.5d) {
                        z = false;
                    }
                    if (z) {
                        f3 = (1.0f - f) * (f2 - 0.5f) * 2.0f;
                    } else {
                        f4 = 1.0f - f;
                        f2 *= 2.0f;
                    }
                }
                return 1.0f - (f4 * f2);
            }
            f3 = (1.0f - f) * f2;
            return f + f3;
        }
    }

    public C7945b(float f, float f2, float f3, float f4, float f5, C7947b bVar) {
        this.f33670g = f;
        this.f33671h = f2;
        this.f33672i = f3;
        this.f33673j = f4;
        this.f33677n = (f5 <= 0.0f || f5 >= 1.0f) ? 0.6f : f5;
        this.f33676m = bVar == null ? C7947b.SCALE_CYCLE : bVar;
        this.f33675l = 1;
    }

    /* renamed from: a */
    public void mo29475a(int i) {
        this.f33675l = i;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f33670g;
        float f3 = f2 + ((this.f33671h - f2) * f);
        float f4 = this.f33672i;
        float f5 = this.f33673j;
        Camera camera = this.f33674k;
        Matrix matrix = transformation.getMatrix();
        camera.save();
        if (this.f33675l == 0) {
            camera.rotateX(f3);
        } else {
            camera.rotateY(f3);
        }
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-f4, -f5);
        matrix.postTranslate(f4, f5);
        matrix.preScale(this.f33676m.getScale(this.f33677n, f), this.f33676m.getScale(this.f33677n, f), f4, f5);
    }

    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.f33674k = new Camera();
    }
}
