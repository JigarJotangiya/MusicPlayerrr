package p159f.p334h.p337b.p338z;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import p159f.p334h.p337b.C7835s;
import p394k.C8633e;

/* renamed from: f.h.b.z.f */
/* compiled from: Platform */
public class C7854f {

    /* renamed from: a */
    private static final C7854f f33374a = m43053e();

    /* renamed from: f.h.b.z.f$a */
    /* compiled from: Platform */
    private static class C7855a extends C7854f {

        /* renamed from: b */
        private final C7853e<Socket> f33375b;

        /* renamed from: c */
        private final C7853e<Socket> f33376c;

        /* renamed from: d */
        private final Method f33377d;

        /* renamed from: e */
        private final Method f33378e;

        /* renamed from: f */
        private final C7853e<Socket> f33379f;

        /* renamed from: g */
        private final C7853e<Socket> f33380g;

        public C7855a(C7853e<Socket> eVar, C7853e<Socket> eVar2, Method method, Method method2, C7853e<Socket> eVar3, C7853e<Socket> eVar4) {
            this.f33375b = eVar;
            this.f33376c = eVar2;
            this.f33377d = method;
            this.f33378e = method2;
            this.f33379f = eVar3;
            this.f33380g = eVar4;
        }

        /* renamed from: c */
        public void mo29286c(SSLSocket sSLSocket, String str, List<C7835s> list) {
            if (str != null) {
                this.f33375b.mo29282e(sSLSocket, Boolean.TRUE);
                this.f33376c.mo29282e(sSLSocket, str);
            }
            C7853e<Socket> eVar = this.f33380g;
            if (eVar != null && eVar.mo29284g(sSLSocket)) {
                this.f33380g.mo29283f(sSLSocket, C7854f.m43052b(list));
            }
        }

        /* renamed from: d */
        public void mo29287d(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
            try {
                socket.connect(inetSocketAddress, i);
            } catch (SecurityException e) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e);
                throw iOException;
            }
        }

        /* renamed from: h */
        public String mo29289h(SSLSocket sSLSocket) {
            byte[] bArr;
            C7853e<Socket> eVar = this.f33379f;
            if (eVar == null || !eVar.mo29284g(sSLSocket) || (bArr = (byte[]) this.f33379f.mo29283f(sSLSocket, new Object[0])) == null) {
                return null;
            }
            return new String(bArr, C7859h.f33392c);
        }

        /* renamed from: j */
        public void mo29291j(Socket socket) throws SocketException {
            Method method = this.f33377d;
            if (method != null) {
                try {
                    method.invoke((Object) null, new Object[]{socket});
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2.getCause());
                }
            }
        }

        /* renamed from: l */
        public void mo29293l(Socket socket) throws SocketException {
            Method method = this.f33378e;
            if (method != null) {
                try {
                    method.invoke((Object) null, new Object[]{socket});
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2.getCause());
                }
            }
        }
    }

    /* renamed from: f.h.b.z.f$b */
    /* compiled from: Platform */
    private static class C7856b extends C7854f {

        /* renamed from: b */
        private final Method f33381b;

        /* renamed from: c */
        private final Method f33382c;

        /* renamed from: d */
        private final Method f33383d;

        /* renamed from: e */
        private final Class<?> f33384e;

        /* renamed from: f */
        private final Class<?> f33385f;

        public C7856b(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
            this.f33381b = method;
            this.f33382c = method2;
            this.f33383d = method3;
            this.f33384e = cls;
            this.f33385f = cls2;
        }

        /* renamed from: a */
        public void mo29285a(SSLSocket sSLSocket) {
            try {
                this.f33383d.invoke((Object) null, new Object[]{sSLSocket});
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        /* renamed from: c */
        public void mo29286c(SSLSocket sSLSocket, String str, List<C7835s> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C7835s sVar = list.get(i);
                if (sVar != C7835s.HTTP_1_0) {
                    arrayList.add(sVar.toString());
                }
            }
            try {
                Object newProxyInstance = Proxy.newProxyInstance(C7854f.class.getClassLoader(), new Class[]{this.f33384e, this.f33385f}, new C7857c(arrayList));
                this.f33381b.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: h */
        public String mo29289h(SSLSocket sSLSocket) {
            try {
                C7857c cVar = (C7857c) Proxy.getInvocationHandler(this.f33382c.invoke((Object) null, new Object[]{sSLSocket}));
                if (!cVar.f33387b && cVar.f33388c == null) {
                    C7848a.f33367a.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (cVar.f33387b) {
                    return null;
                } else {
                    return cVar.f33388c;
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: f.h.b.z.f$c */
    /* compiled from: Platform */
    private static class C7857c implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f33386a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f33387b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f33388c;

        public C7857c(List<String> list) {
            this.f33386a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C7859h.f33391b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f33387b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f33386a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f33386a.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f33388c = str;
                            return str;
                        }
                    }
                    String str2 = this.f33386a.get(0);
                    this.f33388c = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f33388c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    /* renamed from: b */
    static byte[] m43052b(List<C7835s> list) {
        C8633e eVar = new C8633e();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C7835s sVar = list.get(i);
            if (sVar != C7835s.HTTP_1_0) {
                eVar.mo30696b1(sVar.toString().length());
                eVar.mo30707f1(sVar.toString());
            }
        }
        return eVar.mo30669F0();
    }

    /* renamed from: e */
    private static C7854f m43053e() {
        C7853e eVar;
        Method method;
        Method method2;
        Class<byte[]> cls = byte[].class;
        try {
            Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException unused) {
            try {
                Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException unused2) {
                try {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider");
                    return new C7856b(cls2.getMethod("put", new Class[]{SSLSocket.class, cls3}), cls2.getMethod("get", new Class[]{SSLSocket.class}), cls2.getMethod("remove", new Class[]{SSLSocket.class}), Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider"));
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    return new C7854f();
                }
            }
        }
        C7853e eVar2 = null;
        C7853e eVar3 = new C7853e((Class<?>) null, "setUseSessionTickets", Boolean.TYPE);
        C7853e eVar4 = new C7853e((Class<?>) null, "setHostname", String.class);
        try {
            Class<?> cls4 = Class.forName("android.net.TrafficStats");
            method = cls4.getMethod("tagSocket", new Class[]{Socket.class});
            try {
                method2 = cls4.getMethod("untagSocket", new Class[]{Socket.class});
                try {
                    Class.forName("android.net.Network");
                    eVar = new C7853e(cls, "getAlpnSelectedProtocol", new Class[0]);
                    try {
                        eVar2 = new C7853e((Class<?>) null, "setAlpnProtocols", cls);
                    } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                    eVar = null;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused6) {
                method2 = null;
                eVar = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused7) {
            method2 = null;
            method = null;
            eVar = null;
        }
        return new C7855a(eVar3, eVar4, method, method2, eVar, eVar2);
    }

    /* renamed from: f */
    public static C7854f m43054f() {
        return f33374a;
    }

    /* renamed from: a */
    public void mo29285a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public void mo29286c(SSLSocket sSLSocket, String str, List<C7835s> list) {
    }

    /* renamed from: d */
    public void mo29287d(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: g */
    public String mo29288g() {
        return "OkHttp";
    }

    /* renamed from: h */
    public String mo29289h(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: i */
    public void mo29290i(String str) {
        System.out.println(str);
    }

    /* renamed from: j */
    public void mo29291j(Socket socket) throws SocketException {
    }

    /* renamed from: k */
    public URI mo29292k(URL url) throws URISyntaxException {
        return url.toURI();
    }

    /* renamed from: l */
    public void mo29293l(Socket socket) throws SocketException {
    }
}
