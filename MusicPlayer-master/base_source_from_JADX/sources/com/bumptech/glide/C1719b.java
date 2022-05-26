package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.C1721c;
import com.bumptech.glide.load.C1792k;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C1765k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.p030n.C1877k;
import com.bumptech.glide.load.p030n.p031a0.C1802b;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import com.bumptech.glide.load.p030n.p032b0.C1839h;
import com.bumptech.glide.load.p034o.C1909a;
import com.bumptech.glide.load.p034o.C1913b;
import com.bumptech.glide.load.p034o.C1920c;
import com.bumptech.glide.load.p034o.C1921d;
import com.bumptech.glide.load.p034o.C1924e;
import com.bumptech.glide.load.p034o.C1929f;
import com.bumptech.glide.load.p034o.C1937g;
import com.bumptech.glide.load.p034o.C1943k;
import com.bumptech.glide.load.p034o.C1962s;
import com.bumptech.glide.load.p034o.C1967t;
import com.bumptech.glide.load.p034o.C1968u;
import com.bumptech.glide.load.p034o.C1972v;
import com.bumptech.glide.load.p034o.C1975w;
import com.bumptech.glide.load.p034o.C1980x;
import com.bumptech.glide.load.p034o.p035y.C1982a;
import com.bumptech.glide.load.p034o.p035y.C1984b;
import com.bumptech.glide.load.p034o.p035y.C1986c;
import com.bumptech.glide.load.p034o.p035y.C1988d;
import com.bumptech.glide.load.p034o.p035y.C1993e;
import com.bumptech.glide.load.p036p.p037d.C2000a;
import com.bumptech.glide.load.p036p.p037d.C2001a0;
import com.bumptech.glide.load.p036p.p037d.C2003b;
import com.bumptech.glide.load.p036p.p037d.C2004b0;
import com.bumptech.glide.load.p036p.p037d.C2014c;
import com.bumptech.glide.load.p036p.p037d.C2018g;
import com.bumptech.glide.load.p036p.p037d.C2019h;
import com.bumptech.glide.load.p036p.p037d.C2022k;
import com.bumptech.glide.load.p036p.p037d.C2034m;
import com.bumptech.glide.load.p036p.p037d.C2040p;
import com.bumptech.glide.load.p036p.p037d.C2046t;
import com.bumptech.glide.load.p036p.p037d.C2048v;
import com.bumptech.glide.load.p036p.p037d.C2051x;
import com.bumptech.glide.load.p036p.p037d.C2052y;
import com.bumptech.glide.load.p036p.p038e.C2056a;
import com.bumptech.glide.load.p036p.p039f.C2062d;
import com.bumptech.glide.load.p036p.p039f.C2063e;
import com.bumptech.glide.load.p036p.p040g.C2064a;
import com.bumptech.glide.load.p036p.p041h.C2066a;
import com.bumptech.glide.load.p036p.p041h.C2070c;
import com.bumptech.glide.load.p036p.p041h.C2072d;
import com.bumptech.glide.load.p036p.p041h.C2080h;
import com.bumptech.glide.load.p036p.p041h.C2082j;
import com.bumptech.glide.load.p036p.p042i.C2083a;
import com.bumptech.glide.load.p036p.p042i.C2084b;
import com.bumptech.glide.load.p036p.p042i.C2085c;
import com.bumptech.glide.load.p036p.p042i.C2086d;
import com.bumptech.glide.manager.C2105d;
import com.bumptech.glide.manager.C2117o;
import com.bumptech.glide.p044n.C2125a;
import com.bumptech.glide.p045o.C2132b;
import com.bumptech.glide.p045o.C2134d;
import com.bumptech.glide.p047q.C2152g;
import com.bumptech.glide.p047q.C2153h;
import com.bumptech.glide.p047q.p048l.C2163f;
import com.bumptech.glide.p047q.p048l.C2166i;
import com.bumptech.glide.p051s.C2193j;
import com.bumptech.glide.p051s.C2194k;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bumptech.glide.b */
/* compiled from: Glide */
public class C1719b implements ComponentCallbacks2 {

    /* renamed from: o */
    private static volatile C1719b f6433o;

    /* renamed from: p */
    private static volatile boolean f6434p;

    /* renamed from: g */
    private final C1807e f6435g;

    /* renamed from: h */
    private final C1839h f6436h;

    /* renamed from: i */
    private final C1726d f6437i;

    /* renamed from: j */
    private final C1732i f6438j;

    /* renamed from: k */
    private final C1802b f6439k;

    /* renamed from: l */
    private final C2117o f6440l;

    /* renamed from: m */
    private final C2105d f6441m;

    /* renamed from: n */
    private final List<C1740k> f6442n = new ArrayList();

    /* renamed from: com.bumptech.glide.b$a */
    /* compiled from: Glide */
    public interface C1720a {
        /* renamed from: d */
        C2153h mo7597d();
    }

    C1719b(Context context, C1877k kVar, C1839h hVar, C1807e eVar, C1802b bVar, C2117o oVar, C2105d dVar, int i, C1720a aVar, Map<Class<?>, C1743l<?, ?>> map, List<C2152g<Object>> list, C1727e eVar2) {
        C2019h hVar2;
        C1792k kVar2;
        C2062d dVar2;
        Context context2 = context;
        C1807e eVar3 = eVar;
        C1802b bVar2 = bVar;
        Class<C2125a> cls = C2125a.class;
        Class<String> cls2 = String.class;
        Class<Integer> cls3 = Integer.class;
        Class<byte[]> cls4 = byte[].class;
        C1729f fVar = C1729f.NORMAL;
        this.f6435g = eVar3;
        this.f6439k = bVar2;
        this.f6436h = hVar;
        this.f6440l = oVar;
        this.f6441m = dVar;
        Resources resources = context.getResources();
        C1732i iVar = new C1732i();
        this.f6438j = iVar;
        iVar.mo7625o(new C2022k());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            iVar.mo7625o(new C2040p());
        }
        List<ImageHeaderParser> g = iVar.mo7617g();
        C2066a aVar2 = new C2066a(context2, g, eVar3, bVar2);
        C1792k<ParcelFileDescriptor, Bitmap> h = C2004b0.m9468h(eVar);
        C2034m mVar = new C2034m(iVar.mo7617g(), resources.getDisplayMetrics(), eVar3, bVar2);
        if (!eVar2.mo7609a(C1721c.C1723b.class) || i2 < 28) {
            C2018g gVar = new C2018g(mVar);
            kVar2 = new C2052y(mVar, bVar2);
            hVar2 = gVar;
        } else {
            kVar2 = new C2046t();
            hVar2 = new C2019h();
        }
        Class<byte[]> cls5 = cls4;
        C2062d dVar3 = new C2062d(context2);
        int i3 = i2;
        C1962s.C1965c cVar = new C1962s.C1965c(resources);
        C1962s.C1966d dVar4 = new C1962s.C1966d(resources);
        Class<String> cls6 = cls2;
        C1962s.C1964b bVar3 = new C1962s.C1964b(resources);
        C1962s.C1966d dVar5 = dVar4;
        C1962s.C1963a aVar3 = new C1962s.C1963a(resources);
        C2014c cVar2 = new C2014c(bVar2);
        Class<Integer> cls7 = cls3;
        C2083a aVar4 = new C2083a();
        C2086d dVar6 = new C2086d();
        ContentResolver contentResolver = context.getContentResolver();
        C1962s.C1964b bVar4 = bVar3;
        iVar.mo7612a(ByteBuffer.class, new C1920c());
        iVar.mo7612a(InputStream.class, new C1967t(bVar2));
        C1962s.C1965c cVar3 = cVar;
        iVar.mo7616e("Bitmap", ByteBuffer.class, Bitmap.class, hVar2);
        iVar.mo7616e("Bitmap", InputStream.class, Bitmap.class, kVar2);
        if (ParcelFileDescriptorRewinder.m8698c()) {
            dVar2 = dVar3;
            iVar.mo7616e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C2048v(mVar));
        } else {
            dVar2 = dVar3;
        }
        iVar.mo7616e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, h);
        iVar.mo7616e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C2004b0.m9463c(eVar));
        iVar.mo7615d(Bitmap.class, Bitmap.class, C1972v.C1973a.m9383a());
        iVar.mo7616e("Bitmap", Bitmap.class, Bitmap.class, new C2001a0());
        iVar.mo7613b(Bitmap.class, cVar2);
        iVar.mo7616e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C2000a(resources, hVar2));
        iVar.mo7616e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C2000a(resources, kVar2));
        iVar.mo7616e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C2000a(resources, h));
        iVar.mo7613b(BitmapDrawable.class, new C2003b(eVar3, cVar2));
        iVar.mo7616e("Gif", InputStream.class, C2070c.class, new C2082j(g, aVar2, bVar2));
        iVar.mo7616e("Gif", ByteBuffer.class, C2070c.class, aVar2);
        iVar.mo7613b(C2070c.class, new C2072d());
        iVar.mo7615d(cls, cls, C1972v.C1973a.m9383a());
        iVar.mo7616e("Bitmap", cls, Bitmap.class, new C2080h(eVar3));
        C2062d dVar7 = dVar2;
        iVar.mo7614c(Uri.class, Drawable.class, dVar7);
        iVar.mo7614c(Uri.class, Bitmap.class, new C2051x(dVar7, eVar3));
        iVar.mo7626p(new C2056a.C2057a());
        iVar.mo7615d(File.class, ByteBuffer.class, new C1921d.C1923b());
        iVar.mo7615d(File.class, InputStream.class, new C1929f.C1935e());
        iVar.mo7614c(File.class, File.class, new C2064a());
        iVar.mo7615d(File.class, ParcelFileDescriptor.class, new C1929f.C1931b());
        iVar.mo7615d(File.class, File.class, C1972v.C1973a.m9383a());
        iVar.mo7626p(new C1765k.C1766a(bVar2));
        if (ParcelFileDescriptorRewinder.m8698c()) {
            iVar.mo7626p(new ParcelFileDescriptorRewinder.C1748a());
        }
        Class cls8 = Integer.TYPE;
        C1962s.C1965c cVar4 = cVar3;
        iVar.mo7615d(cls8, InputStream.class, cVar4);
        C1962s.C1964b bVar5 = bVar4;
        iVar.mo7615d(cls8, ParcelFileDescriptor.class, bVar5);
        Class<Integer> cls9 = cls7;
        iVar.mo7615d(cls9, InputStream.class, cVar4);
        iVar.mo7615d(cls9, ParcelFileDescriptor.class, bVar5);
        C1962s.C1966d dVar8 = dVar5;
        iVar.mo7615d(cls9, Uri.class, dVar8);
        C1962s.C1963a aVar5 = aVar3;
        iVar.mo7615d(cls8, AssetFileDescriptor.class, aVar5);
        iVar.mo7615d(cls9, AssetFileDescriptor.class, aVar5);
        iVar.mo7615d(cls8, Uri.class, dVar8);
        Class<String> cls10 = cls6;
        iVar.mo7615d(cls10, InputStream.class, new C1924e.C1927c());
        iVar.mo7615d(Uri.class, InputStream.class, new C1924e.C1927c());
        iVar.mo7615d(cls10, InputStream.class, new C1968u.C1971c());
        iVar.mo7615d(cls10, ParcelFileDescriptor.class, new C1968u.C1970b());
        iVar.mo7615d(cls10, AssetFileDescriptor.class, new C1968u.C1969a());
        iVar.mo7615d(Uri.class, InputStream.class, new C1909a.C1912c(context.getAssets()));
        iVar.mo7615d(Uri.class, ParcelFileDescriptor.class, new C1909a.C1911b(context.getAssets()));
        Context context3 = context;
        iVar.mo7615d(Uri.class, InputStream.class, new C1984b.C1985a(context3));
        iVar.mo7615d(Uri.class, InputStream.class, new C1986c.C1987a(context3));
        int i4 = i3;
        if (i4 >= 29) {
            iVar.mo7615d(Uri.class, InputStream.class, new C1988d.C1991c(context3));
            iVar.mo7615d(Uri.class, ParcelFileDescriptor.class, new C1988d.C1990b(context3));
        }
        ContentResolver contentResolver2 = contentResolver;
        iVar.mo7615d(Uri.class, InputStream.class, new C1975w.C1979d(contentResolver2));
        iVar.mo7615d(Uri.class, ParcelFileDescriptor.class, new C1975w.C1977b(contentResolver2));
        iVar.mo7615d(Uri.class, AssetFileDescriptor.class, new C1975w.C1976a(contentResolver2));
        iVar.mo7615d(Uri.class, InputStream.class, new C1980x.C1981a());
        iVar.mo7615d(URL.class, InputStream.class, new C1993e.C1994a());
        iVar.mo7615d(Uri.class, File.class, new C1943k.C1944a(context3));
        iVar.mo7615d(C1937g.class, InputStream.class, new C1982a.C1983a());
        Class<byte[]> cls11 = cls5;
        iVar.mo7615d(cls11, ByteBuffer.class, new C1913b.C1914a());
        iVar.mo7615d(cls11, InputStream.class, new C1913b.C1918d());
        iVar.mo7615d(Uri.class, Uri.class, C1972v.C1973a.m9383a());
        iVar.mo7615d(Drawable.class, Drawable.class, C1972v.C1973a.m9383a());
        iVar.mo7614c(Drawable.class, Drawable.class, new C2063e());
        iVar.mo7627q(Bitmap.class, BitmapDrawable.class, new C2084b(resources));
        C2083a aVar6 = aVar4;
        iVar.mo7627q(Bitmap.class, cls11, aVar6);
        C2086d dVar9 = dVar6;
        iVar.mo7627q(Drawable.class, cls11, new C2085c(eVar3, aVar6, dVar9));
        iVar.mo7627q(C2070c.class, cls11, dVar9);
        if (i4 >= 23) {
            C1792k<ByteBuffer, Bitmap> d = C2004b0.m9464d(eVar);
            iVar.mo7614c(ByteBuffer.class, Bitmap.class, d);
            iVar.mo7614c(ByteBuffer.class, BitmapDrawable.class, new C2000a(resources, d));
        }
        this.f6437i = new C1726d(context, bVar, iVar, new C2163f(), aVar, map, list, kVar, eVar2, i);
    }

    /* renamed from: a */
    private static void m8590a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f6434p) {
            f6434p = true;
            m8594m(context, generatedAppGlideModule);
            f6434p = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /* renamed from: c */
    public static C1719b m8591c(Context context) {
        if (f6433o == null) {
            GeneratedAppGlideModule d = m8592d(context.getApplicationContext());
            synchronized (C1719b.class) {
                if (f6433o == null) {
                    m8590a(context, d);
                }
            }
        }
        return f6433o;
    }

    /* renamed from: d */
    private static GeneratedAppGlideModule m8592d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (InstantiationException e) {
            m8596q(e);
            throw null;
        } catch (IllegalAccessException e2) {
            m8596q(e2);
            throw null;
        } catch (NoSuchMethodException e3) {
            m8596q(e3);
            throw null;
        } catch (InvocationTargetException e4) {
            m8596q(e4);
            throw null;
        }
    }

    /* renamed from: l */
    private static C2117o m8593l(Context context) {
        C2193j.m10270e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m8591c(context).mo7589k();
    }

    /* renamed from: m */
    private static void m8594m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m8595n(context, new C1721c(), generatedAppGlideModule);
    }

    /* renamed from: n */
    private static void m8595n(Context context, C1721c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<C2132b> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo8332c()) {
            emptyList = new C2134d(applicationContext).mo8336a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo7580d().isEmpty()) {
            Set<Class<?>> d = generatedAppGlideModule.mo7580d();
            Iterator<C2132b> it = emptyList.iterator();
            while (it.hasNext()) {
                C2132b next = it.next();
                if (d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (C2132b bVar : emptyList) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + bVar.getClass());
            }
        }
        cVar.mo7599b(generatedAppGlideModule != null ? generatedAppGlideModule.mo7581e() : null);
        for (C2132b a : emptyList) {
            a.mo8333a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo8331b(applicationContext, cVar);
        }
        C1719b a2 = cVar.mo7598a(applicationContext);
        for (C2132b next2 : emptyList) {
            try {
                next2.mo8334b(applicationContext, a2, a2.f6438j);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + next2.getClass().getName(), e);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo8335a(applicationContext, a2, a2.f6438j);
        }
        applicationContext.registerComponentCallbacks(a2);
        f6433o = a2;
    }

    /* renamed from: q */
    private static void m8596q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static C1740k m8597t(Context context) {
        return m8593l(context).mo8286l(context);
    }

    /* renamed from: u */
    public static C1740k m8598u(View view) {
        return m8593l(view.getContext()).mo8287m(view);
    }

    /* renamed from: b */
    public void mo7582b() {
        C2194k.m10272b();
        this.f6436h.mo7838b();
        this.f6435g.mo7790b();
        this.f6439k.mo7768b();
    }

    /* renamed from: e */
    public C1802b mo7583e() {
        return this.f6439k;
    }

    /* renamed from: f */
    public C1807e mo7584f() {
        return this.f6435g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C2105d mo7585g() {
        return this.f6441m;
    }

    /* renamed from: h */
    public Context mo7586h() {
        return this.f6437i.getBaseContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C1726d mo7587i() {
        return this.f6437i;
    }

    /* renamed from: j */
    public C1732i mo7588j() {
        return this.f6438j;
    }

    /* renamed from: k */
    public C2117o mo7589k() {
        return this.f6440l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo7590o(C1740k kVar) {
        synchronized (this.f6442n) {
            if (!this.f6442n.contains(kVar)) {
                this.f6442n.add(kVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo7582b();
    }

    public void onTrimMemory(int i) {
        mo7595r(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo7594p(C2166i<?> iVar) {
        synchronized (this.f6442n) {
            for (C1740k B : this.f6442n) {
                if (B.mo7647B(iVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: r */
    public void mo7595r(int i) {
        C2194k.m10272b();
        synchronized (this.f6442n) {
            for (C1740k onTrimMemory : this.f6442n) {
                onTrimMemory.onTrimMemory(i);
            }
        }
        this.f6436h.mo7830a(i);
        this.f6435g.mo7789a(i);
        this.f6439k.mo7767a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo7596s(C1740k kVar) {
        synchronized (this.f6442n) {
            if (this.f6442n.contains(kVar)) {
                this.f6442n.remove(kVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}
