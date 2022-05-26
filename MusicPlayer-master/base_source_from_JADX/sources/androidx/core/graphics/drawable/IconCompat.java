package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.p003d.C0524f;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    static final PorterDuff.Mode f2725k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f2726a = -1;

    /* renamed from: b */
    Object f2727b;

    /* renamed from: c */
    public byte[] f2728c = null;

    /* renamed from: d */
    public Parcelable f2729d = null;

    /* renamed from: e */
    public int f2730e = 0;

    /* renamed from: f */
    public int f2731f = 0;

    /* renamed from: g */
    public ColorStateList f2732g = null;

    /* renamed from: h */
    PorterDuff.Mode f2733h = f2725k;

    /* renamed from: i */
    public String f2734i = null;

    /* renamed from: j */
    public String f2735j;

    public IconCompat() {
    }

    /* renamed from: d */
    static Bitmap m3254d(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    /* renamed from: e */
    public static IconCompat m3255e(Context context, int i) {
        if (context != null) {
            return m3256f(context.getResources(), context.getPackageName(), i);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    /* renamed from: f */
    public static IconCompat m3256f(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f2730e = i;
            if (resources != null) {
                try {
                    iconCompat.f2727b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f2727b = str;
            }
            iconCompat.f2735j = str;
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    /* renamed from: h */
    private static int m3257h(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    /* renamed from: j */
    private static String m3258j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* renamed from: k */
    private static Resources m3259k(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[]{str}), e);
            return null;
        }
    }

    /* renamed from: m */
    private static int m3260m(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e);
            return -1;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e2);
            return -1;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e3);
            return -1;
        }
    }

    /* renamed from: o */
    private static Uri m3261o(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    /* renamed from: r */
    private Drawable m3262r(Context context) {
        switch (this.f2726a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f2727b);
            case 2:
                String i = mo3295i();
                if (TextUtils.isEmpty(i)) {
                    i = context.getPackageName();
                }
                try {
                    return C0524f.m3225f(m3259k(context, i), this.f2730e, context.getTheme());
                } catch (RuntimeException e) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", new Object[]{Integer.valueOf(this.f2730e), this.f2727b}), e);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f2727b, this.f2730e, this.f2731f));
            case 4:
                InputStream p = mo3298p(context);
                if (p != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(p));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), m3254d((Bitmap) this.f2727b, false));
            case 6:
                InputStream p2 = mo3298p(context);
                if (p2 != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        return new AdaptiveIconDrawable((Drawable) null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(p2)));
                    }
                    return new BitmapDrawable(context.getResources(), m3254d(BitmapFactory.decodeStream(p2), false));
                }
                break;
        }
        return null;
    }

    /* renamed from: w */
    private static String m3263w(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: c */
    public void mo3293c(Context context) {
        Object obj;
        if (this.f2726a == 2 && (obj = this.f2727b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                String i = mo3295i();
                int identifier = m3259k(context, i).getIdentifier(str4, str3, str5);
                if (this.f2730e != identifier) {
                    Log.i("IconCompat", "Id has changed for " + i + " " + str);
                    this.f2730e = identifier;
                }
            }
        }
    }

    /* renamed from: g */
    public int mo3294g() {
        int i = this.f2726a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m3257h((Icon) this.f2727b);
        }
        if (i == 2) {
            return this.f2730e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: i */
    public String mo3295i() {
        int i = this.f2726a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m3258j((Icon) this.f2727b);
        }
        if (i != 2) {
            throw new IllegalStateException("called getResPackage() on " + this);
        } else if (TextUtils.isEmpty(this.f2735j)) {
            return ((String) this.f2727b).split(":", -1)[0];
        } else {
            return this.f2735j;
        }
    }

    /* renamed from: l */
    public int mo3296l() {
        int i = this.f2726a;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : m3260m((Icon) this.f2727b);
    }

    /* renamed from: n */
    public Uri mo3297n() {
        int i = this.f2726a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m3261o((Icon) this.f2727b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f2727b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: p */
    public InputStream mo3298p(Context context) {
        Uri n = mo3297n();
        String scheme = n.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(n);
            } catch (Exception e) {
                Log.w("IconCompat", "Unable to load image from URI: " + n, e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f2727b));
            } catch (FileNotFoundException e2) {
                Log.w("IconCompat", "Unable to load image from path: " + n, e2);
                return null;
            }
        }
    }

    /* renamed from: q */
    public Drawable mo3299q(Context context) {
        mo3293c(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return mo3304v(context).loadDrawable(context);
        }
        Drawable r = m3262r(context);
        if (!(r == null || (this.f2732g == null && this.f2733h == f2725k))) {
            r.mutate();
            C0534a.m3289o(r, this.f2732g);
            C0534a.m3290p(r, this.f2733h);
        }
        return r;
    }

    /* renamed from: s */
    public void mo3300s() {
        this.f2733h = PorterDuff.Mode.valueOf(this.f2734i);
        switch (this.f2726a) {
            case -1:
                Parcelable parcelable = this.f2729d;
                if (parcelable != null) {
                    this.f2727b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.f2729d;
                if (parcelable2 != null) {
                    this.f2727b = parcelable2;
                    return;
                }
                byte[] bArr = this.f2728c;
                this.f2727b = bArr;
                this.f2726a = 3;
                this.f2730e = 0;
                this.f2731f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2728c, Charset.forName("UTF-16"));
                this.f2727b = str;
                if (this.f2726a == 2 && this.f2735j == null) {
                    this.f2735j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2727b = this.f2728c;
                return;
            default:
                return;
        }
    }

    /* renamed from: t */
    public void mo3301t(boolean z) {
        this.f2734i = this.f2733h.name();
        switch (this.f2726a) {
            case -1:
                if (!z) {
                    this.f2729d = (Parcelable) this.f2727b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f2727b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f2728c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f2729d = (Parcelable) this.f2727b;
                return;
            case 2:
                this.f2728c = ((String) this.f2727b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2728c = (byte[]) this.f2727b;
                return;
            case 4:
            case 6:
                this.f2728c = this.f2727b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
    }

    public String toString() {
        if (this.f2726a == -1) {
            return String.valueOf(this.f2727b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m3263w(this.f2726a));
        switch (this.f2726a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2727b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2727b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2735j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(mo3294g())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2730e);
                if (this.f2731f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2731f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2727b);
                break;
        }
        if (this.f2732g != null) {
            sb.append(" tint=");
            sb.append(this.f2732g);
        }
        if (this.f2733h != f2725k) {
            sb.append(" mode=");
            sb.append(this.f2733h);
        }
        sb.append(")");
        return sb.toString();
    }

    @Deprecated
    /* renamed from: u */
    public Icon mo3303u() {
        return mo3304v((Context) null);
    }

    /* renamed from: v */
    public Icon mo3304v(Context context) {
        Icon icon;
        switch (this.f2726a) {
            case -1:
                return (Icon) this.f2727b;
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.f2727b);
                break;
            case 2:
                icon = Icon.createWithResource(mo3295i(), this.f2730e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.f2727b, this.f2730e, this.f2731f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.f2727b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    icon = Icon.createWithBitmap(m3254d((Bitmap) this.f2727b, false));
                    break;
                } else {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.f2727b);
                    break;
                }
            case 6:
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    icon = Icon.createWithAdaptiveBitmapContentUri(mo3297n());
                    break;
                } else if (context != null) {
                    InputStream p = mo3298p(context);
                    if (p != null) {
                        if (i < 26) {
                            icon = Icon.createWithBitmap(m3254d(BitmapFactory.decodeStream(p), false));
                            break;
                        } else {
                            icon = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(p));
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + mo3297n());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + mo3297n());
                }
            default:
                throw new IllegalArgumentException("Unknown type");
        }
        ColorStateList colorStateList = this.f2732g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f2733h;
        if (mode != f2725k) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    private IconCompat(int i) {
        this.f2726a = i;
    }
}
