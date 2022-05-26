package com.airbnb.lottie.p026y;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import com.airbnb.lottie.C1462c;
import com.airbnb.lottie.p015t.p016b.C1528s;
import com.airbnb.lottie.p015t.p017c.C1539d;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: com.airbnb.lottie.y.h */
/* compiled from: Utils */
public final class C1683h {

    /* renamed from: a */
    private static final ThreadLocal<PathMeasure> f6327a = new C1684a();

    /* renamed from: b */
    private static final ThreadLocal<Path> f6328b = new C1685b();

    /* renamed from: c */
    private static final ThreadLocal<Path> f6329c = new C1686c();

    /* renamed from: d */
    private static final ThreadLocal<float[]> f6330d = new C1687d();

    /* renamed from: e */
    private static final float f6331e = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: f */
    private static float f6332f = -1.0f;

    /* renamed from: com.airbnb.lottie.y.h$a */
    /* compiled from: Utils */
    class C1684a extends ThreadLocal<PathMeasure> {
        C1684a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* renamed from: com.airbnb.lottie.y.h$b */
    /* compiled from: Utils */
    class C1685b extends ThreadLocal<Path> {
        C1685b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: com.airbnb.lottie.y.h$c */
    /* compiled from: Utils */
    class C1686c extends ThreadLocal<Path> {
        C1686c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: com.airbnb.lottie.y.h$d */
    /* compiled from: Utils */
    class C1687d extends ThreadLocal<float[]> {
        C1687d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float[] initialValue() {
            return new float[4];
        }
    }

    /* renamed from: a */
    public static void m8455a(Path path, float f, float f2, float f3) {
        C1462c.m7603a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f6327a.get();
        Path path2 = f6328b.get();
        Path path3 = f6329c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C1462c.m7604b("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            C1462c.m7604b("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C1682g.m8448g(min, length);
                max = (float) C1682g.m8448g(max, length);
            }
            if (min < 0.0f) {
                min = (float) C1682g.m8448g(min, length);
            }
            if (max < 0.0f) {
                max = (float) C1682g.m8448g(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                C1462c.m7604b("applyTrimPathIfNeeded");
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            C1462c.m7604b("applyTrimPathIfNeeded");
        }
    }

    /* renamed from: b */
    public static void m8456b(Path path, C1528s sVar) {
        if (sVar != null && !sVar.mo7150j()) {
            m8455a(path, ((C1539d) sVar.mo7148h()).mo7180p() / 100.0f, ((C1539d) sVar.mo7146e()).mo7180p() / 100.0f, ((C1539d) sVar.mo7147g()).mo7180p() / 360.0f);
        }
    }

    /* renamed from: c */
    public static void m8457c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static Path m8458d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF.x;
            float f2 = pointF2.x;
            float f3 = pointF2.y;
            path.cubicTo(pointF3.x + f, pointF.y + pointF3.y, f2 + pointF4.x, f3 + pointF4.y, f2, f3);
        }
        return path;
    }

    /* renamed from: e */
    public static float m8459e() {
        if (f6332f == -1.0f) {
            f6332f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f6332f;
    }

    /* renamed from: f */
    public static float m8460f(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        return Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* renamed from: g */
    public static float m8461g(Matrix matrix) {
        float[] fArr = f6330d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f6331e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }

    /* renamed from: h */
    public static boolean m8462h(Matrix matrix) {
        float[] fArr = f6330d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static int m8463i(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (((float) 527) * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    /* renamed from: j */
    public static boolean m8464j(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    /* renamed from: k */
    public static boolean m8465k(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    /* renamed from: l */
    public static Bitmap m8466l(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: m */
    public static void m8467m(Canvas canvas, RectF rectF, Paint paint) {
        m8468n(canvas, rectF, paint, 31);
    }

    /* renamed from: n */
    public static void m8468n(Canvas canvas, RectF rectF, Paint paint, int i) {
        C1462c.m7603a("Utils#saveLayer");
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        C1462c.m7604b("Utils#saveLayer");
    }
}
