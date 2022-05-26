package p159f.p243f.p245b.p304b.p305m;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: f.f.b.b.m.f */
/* compiled from: ImageMatrixProperty */
public class C7506f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f32708a = new Matrix();

    public C7506f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f32708a.set(imageView.getImageMatrix());
        return this.f32708a;
    }

    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
