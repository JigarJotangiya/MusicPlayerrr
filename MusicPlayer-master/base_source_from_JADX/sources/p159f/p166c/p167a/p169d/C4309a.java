package p159f.p166c.p167a.p169d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: f.c.a.d.a */
/* compiled from: AlphaPatternDrawable */
public class C4309a extends Drawable {

    /* renamed from: a */
    private int f12874a = 10;

    /* renamed from: b */
    private Paint f12875b = new Paint();

    /* renamed from: c */
    private Paint f12876c = new Paint();

    /* renamed from: d */
    private Paint f12877d = new Paint();

    /* renamed from: e */
    private int f12878e;

    /* renamed from: f */
    private int f12879f;

    /* renamed from: g */
    private Bitmap f12880g;

    public C4309a(int i) {
        this.f12874a = i;
        this.f12876c.setColor(-1);
        this.f12877d.setColor(-3421237);
    }

    /* renamed from: a */
    private void m18825a() {
        if (getBounds().width() > 0 && getBounds().height() > 0) {
            this.f12880g = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f12880g);
            Rect rect = new Rect();
            boolean z = true;
            for (int i = 0; i <= this.f12879f; i++) {
                boolean z2 = z;
                for (int i2 = 0; i2 <= this.f12878e; i2++) {
                    int i3 = this.f12874a;
                    int i4 = i * i3;
                    rect.top = i4;
                    int i5 = i2 * i3;
                    rect.left = i5;
                    rect.bottom = i4 + i3;
                    rect.right = i5 + i3;
                    canvas.drawRect(rect, z2 ? this.f12876c : this.f12877d);
                    z2 = !z2;
                }
                z = !z;
            }
        }
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(this.f12880g, (Rect) null, getBounds(), this.f12875b);
    }

    public int getOpacity() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int height = rect.height();
        this.f12878e = (int) Math.ceil((double) (rect.width() / this.f12874a));
        this.f12879f = (int) Math.ceil((double) (height / this.f12874a));
        m18825a();
    }

    public void setAlpha(int i) {
        throw new UnsupportedOperationException("Alpha is not supported by this drawwable.");
    }

    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawwable.");
    }
}
