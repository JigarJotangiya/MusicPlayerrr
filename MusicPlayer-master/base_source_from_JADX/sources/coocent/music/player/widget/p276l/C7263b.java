package coocent.music.player.widget.p276l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.widget.Checkable;
import java.util.ArrayList;

/* renamed from: coocent.music.player.widget.l.b */
/* compiled from: RCHelper */
public class C7263b {

    /* renamed from: a */
    public float[] f32056a = new float[8];

    /* renamed from: b */
    public Path f32057b;

    /* renamed from: c */
    public Paint f32058c;

    /* renamed from: d */
    public boolean f32059d = true;

    /* renamed from: e */
    public int f32060e = 0;

    /* renamed from: f */
    public int f32061f = 0;

    /* renamed from: g */
    public ColorStateList f32062g;

    /* renamed from: h */
    public int f32063h;

    /* renamed from: i */
    public boolean f32064i;

    /* renamed from: j */
    public Region f32065j;

    /* renamed from: k */
    public RectF f32066k;

    /* renamed from: l */
    public boolean f32067l;

    /* renamed from: m */
    public C7264a f32068m;

    /* renamed from: coocent.music.player.widget.l.b$a */
    /* compiled from: RCHelper */
    public interface C7264a {
        /* renamed from: a */
        void mo27849a(View view, boolean z);
    }

    /* renamed from: a */
    public void mo27844a(View view) {
        if (view instanceof C7262a) {
            ArrayList arrayList = new ArrayList();
            if (view instanceof Checkable) {
                arrayList.add(16842911);
                if (((Checkable) view).isChecked()) {
                    arrayList.add(16842912);
                }
            }
            if (view.isEnabled()) {
                arrayList.add(16842910);
            }
            if (view.isFocused()) {
                arrayList.add(16842908);
            }
            if (view.isPressed()) {
                arrayList.add(16842919);
            }
            if (view.isHovered()) {
                arrayList.add(16843623);
            }
            if (view.isSelected()) {
                arrayList.add(16842913);
            }
            if (view.isActivated()) {
                arrayList.add(16843518);
            }
            if (view.hasWindowFocus()) {
                arrayList.add(16842909);
            }
            ColorStateList colorStateList = this.f32062g;
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Integer) arrayList.get(i)).intValue();
                }
                ((C7262a) view).setStrokeColor(this.f32062g.getColorForState(iArr, this.f32060e));
            }
        }
    }

    /* renamed from: b */
    public void mo27845b() {
        this.f32066k = new RectF();
        this.f32057b = new Path();
        this.f32065j = new Region();
        Paint paint = new Paint();
        this.f32058c = paint;
        paint.setColor(-1);
        this.f32058c.setAntiAlias(true);
    }

    /* renamed from: c */
    public void mo27846c(Canvas canvas) {
        if (this.f32063h > 0) {
            this.f32058c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.f32058c.setColor(-1);
            this.f32058c.setStrokeWidth((float) (this.f32063h * 2));
            this.f32058c.setStyle(Paint.Style.STROKE);
            canvas.drawPath(this.f32057b, this.f32058c);
            this.f32058c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            this.f32058c.setColor(this.f32061f);
            this.f32058c.setStyle(Paint.Style.STROKE);
            canvas.drawPath(this.f32057b, this.f32058c);
        }
        this.f32058c.setColor(-1);
        this.f32058c.setStyle(Paint.Style.FILL);
        if (Build.VERSION.SDK_INT <= 27) {
            this.f32058c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawPath(this.f32057b, this.f32058c);
            return;
        }
        this.f32058c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Path path = new Path();
        path.addRect(0.0f, 0.0f, (float) ((int) this.f32066k.width()), (float) ((int) this.f32066k.height()), Path.Direction.CW);
        path.op(this.f32057b, Path.Op.DIFFERENCE);
        canvas.drawPath(path, this.f32058c);
    }

    /* renamed from: d */
    public void mo27847d(View view, int i, int i2) {
        this.f32066k.set(0.0f, 0.0f, (float) i, (float) i2);
        mo27848e(view);
    }

    /* renamed from: e */
    public void mo27848e(View view) {
        int width = (int) this.f32066k.width();
        int height = (int) this.f32066k.height();
        RectF rectF = new RectF();
        rectF.left = (float) view.getPaddingLeft();
        rectF.top = (float) view.getPaddingTop();
        rectF.right = (float) (width - view.getPaddingRight());
        rectF.bottom = (float) (height - view.getPaddingBottom());
        this.f32057b.reset();
        if (this.f32059d) {
            float height2 = (rectF.width() >= rectF.height() ? rectF.height() : rectF.width()) / 2.0f;
            float f = (float) (height / 2);
            PointF pointF = new PointF((float) (width / 2), f);
            if (Build.VERSION.SDK_INT <= 27) {
                this.f32057b.addCircle(pointF.x, pointF.y, height2, Path.Direction.CW);
                this.f32057b.moveTo(0.0f, 0.0f);
                this.f32057b.moveTo((float) width, (float) height);
            } else {
                float f2 = f - height2;
                this.f32057b.moveTo(rectF.left, f2);
                this.f32057b.addCircle(pointF.x, f2 + height2, height2, Path.Direction.CW);
            }
        } else {
            this.f32057b.addRoundRect(rectF, this.f32056a, Path.Direction.CW);
        }
        this.f32065j.setPath(this.f32057b, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
    }
}
