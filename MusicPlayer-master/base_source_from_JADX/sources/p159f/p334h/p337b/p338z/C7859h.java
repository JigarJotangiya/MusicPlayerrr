package p159f.p334h.p337b.p338z;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p394k.C8620a0;
import p394k.C8633e;
import p394k.C8638h;

/* renamed from: f.h.b.z.h */
/* compiled from: Util */
public final class C7859h {

    /* renamed from: a */
    public static final byte[] f33390a = new byte[0];

    /* renamed from: b */
    public static final String[] f33391b = new String[0];

    /* renamed from: c */
    public static final Charset f33392c = Charset.forName("UTF-8");

    /* renamed from: f.h.b.z.h$a */
    /* compiled from: Util */
    static class C7860a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f33393a;

        /* renamed from: b */
        final /* synthetic */ boolean f33394b;

        C7860a(String str, boolean z) {
            this.f33393a = str;
            this.f33394b = z;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f33393a);
            thread.setDaemon(this.f33394b);
            return thread;
        }
    }

    /* renamed from: a */
    public static void m43077a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: b */
    public static void m43078b(Closeable closeable, Closeable closeable2) throws IOException {
        try {
            closeable.close();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            closeable2.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            } else if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            } else if (th instanceof Error) {
                throw th;
            } else {
                throw new AssertionError(th);
            }
        }
    }

    /* renamed from: c */
    public static void m43079c(Closeable closeable) {
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
    public static void m43080d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public static boolean m43081e(C8620a0 a0Var, int i, TimeUnit timeUnit) {
        try {
            return m43093q(a0Var, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m43082f(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: g */
    public static int m43083g(String str) {
        if ("http".equals(str)) {
            return 80;
        }
        return "https".equals(str) ? 443 : -1;
    }

    /* renamed from: h */
    private static int m43084h(String str, int i) {
        return i != -1 ? i : m43083g(str);
    }

    /* renamed from: i */
    public static int m43085i(URI uri) {
        return m43084h(uri.getScheme(), uri.getPort());
    }

    /* renamed from: j */
    public static int m43086j(URL url) {
        return m43084h(url.getProtocol(), url.getPort());
    }

    /* renamed from: k */
    public static <T> List<T> m43087k(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: l */
    public static <T> List<T> m43088l(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: m */
    public static <K, V> Map<K, V> m43089m(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: n */
    private static <T> List<T> m43090n(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            int length = tArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                T t2 = tArr2[i];
                if (t.equals(t2)) {
                    arrayList.add(t2);
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public static <T> T[] m43091o(Class<T> cls, T[] tArr, T[] tArr2) {
        List n = m43090n(tArr, tArr2);
        return n.toArray((Object[]) Array.newInstance(cls, n.size()));
    }

    /* renamed from: p */
    public static C8638h m43092p(C8638h hVar) {
        try {
            return C8638h.m46960of(MessageDigest.getInstance("SHA-1").digest(hVar.toByteArray()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: q */
    public static boolean m43093q(C8620a0 a0Var, int i, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long b = a0Var.timeout().mo30648d() ? a0Var.timeout().mo30646b() - nanoTime : Long.MAX_VALUE;
        a0Var.timeout().mo30647c(Math.min(b, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C8633e eVar = new C8633e();
            while (a0Var.mo29326w0(eVar, 2048) != -1) {
                eVar.mo30697c();
            }
            if (b == Long.MAX_VALUE) {
                a0Var.timeout().mo30645a();
            } else {
                a0Var.timeout().mo30647c(nanoTime + b);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (b == Long.MAX_VALUE) {
                a0Var.timeout().mo30645a();
            } else {
                a0Var.timeout().mo30647c(nanoTime + b);
            }
            return false;
        } catch (Throwable th) {
            if (b == Long.MAX_VALUE) {
                a0Var.timeout().mo30645a();
            } else {
                a0Var.timeout().mo30647c(nanoTime + b);
            }
            throw th;
        }
    }

    /* renamed from: r */
    public static ThreadFactory m43094r(String str, boolean z) {
        return new C7860a(str, z);
    }
}
