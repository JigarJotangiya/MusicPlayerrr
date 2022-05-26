package coocent.music.player.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8343s;
import p443m.p444a.p447e.p448a.C9332d;

public class ArcProgressView extends View {

    /* renamed from: g */
    private Bitmap f31453g = BitmapFactory.decodeResource(getResources(), 2131231042);

    /* renamed from: h */
    private Paint f31454h = new Paint(1);

    /* renamed from: i */
    private RectF f31455i = new RectF();

    /* renamed from: j */
    private float f31456j = 0.0f;

    /* renamed from: k */
    private float f31457k;

    /* renamed from: l */
    private float f31458l;

    public ArcProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m40542a() {
        Matrix matrix = new Matrix();
        float width = (float) this.f31453g.getWidth();
        float height = (float) this.f31453g.getHeight();
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        float f = this.f31457k;
        float f2 = width / 2.0f;
        float f3 = this.f31458l;
        float f4 = height / 2.0f;
        matrix.setRectToRect(rectF, new RectF((f / 2.0f) - f2, (f3 / 2.0f) - f4, (f / 2.0f) + f2, (f3 / 2.0f) + f4), Matrix.ScaleToFit.CENTER);
        Bitmap bitmap = this.f31453g;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        this.f31454h.setShader(bitmapShader);
        matrix.mapRect(this.f31455i, rectF);
    }

    /* renamed from: b */
    public void mo27372b() {
        this.f31454h.setColorFilter(new PorterDuffColorFilter(C8343s.m46300h(), PorterDuff.Mode.SRC_IN));
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.drawArc(this.f31455i, 90.0f, this.f31456j, true, this.f31454h);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f31457k = (float) i;
        this.f31458l = (float) i2;
        m40542a();
    }

    public void setDegree(float f) {
        this.f31456j = f;
        invalidate();
    }

    public void setEnabled(boolean z) {
        int i;
        Paint paint = this.f31454h;
        if (z) {
            i = C8343s.m46300h();
        } else {
            i = C8343s.m46295c(R.color.app_sub_title_color);
        }
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        super.setEnabled(z);
    }

    public void setImageResource(int i) {
        this.f31453g = ((BitmapDrawable) C9332d.m49407d(getContext(), i)).getBitmap();
        m40542a();
        postInvalidate();
    }
}
