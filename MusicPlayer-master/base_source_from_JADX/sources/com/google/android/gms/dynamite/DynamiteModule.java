package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C3289k;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.util.C3361f;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class DynamiteModule {
    @RecentlyNonNull

    /* renamed from: b */
    public static final C3380b f10792b = new C3384d();
    @RecentlyNonNull

    /* renamed from: c */
    public static final C3380b f10793c = new C3385e();

    /* renamed from: d */
    private static Boolean f10794d = null;

    /* renamed from: e */
    private static String f10795e = null;

    /* renamed from: f */
    private static int f10796f = -1;

    /* renamed from: g */
    private static final ThreadLocal<C3386f> f10797g = new ThreadLocal<>();

    /* renamed from: h */
    private static final ThreadLocal<Long> f10798h = new C3382b();

    /* renamed from: i */
    private static final C3388h f10799i = new C3383c();

    /* renamed from: j */
    private static C3390j f10800j;

    /* renamed from: k */
    private static C3391k f10801k;

    /* renamed from: a */
    private final Context f10802a;

    @DynamiteApi
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static class DynamiteLoaderClassLoader {
        @RecentlyNullable
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static class C3379a extends Exception {
        /* synthetic */ C3379a(String str, C3382b bVar) {
            super(str);
        }

        /* synthetic */ C3379a(String str, Throwable th, C3382b bVar) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface C3380b {
        /* renamed from: a */
        C3389i mo11999a(Context context, String str, C3388h hVar) throws C3379a;
    }

    private DynamiteModule(Context context) {
        C3292l.m14240h(context);
        this.f10802a = context;
    }

    /* renamed from: a */
    public static int m14487a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C3289k.m14227a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /* renamed from: c */
    public static int m14488c(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        return m14490f(context, str, false);
    }

    @RecentlyNonNull
    /* renamed from: e */
    public static DynamiteModule m14489e(@RecentlyNonNull Context context, @RecentlyNonNull C3380b bVar, @RecentlyNonNull String str) throws C3379a {
        String str2;
        int i;
        Boolean bool;
        DynamiteModule dynamiteModule;
        C4863a aVar;
        C3391k kVar;
        Boolean valueOf;
        C4863a aVar2;
        Context context2 = context;
        C3380b bVar2 = bVar;
        String str3 = str;
        Class<DynamiteModule> cls = DynamiteModule.class;
        ThreadLocal<C3386f> threadLocal = f10797g;
        C3386f fVar = threadLocal.get();
        C3386f fVar2 = new C3386f((C3382b) null);
        threadLocal.set(fVar2);
        ThreadLocal<Long> threadLocal2 = f10798h;
        long longValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            C3389i a = bVar2.mo11999a(context2, str3, f10799i);
            int i2 = a.f10805a;
            int i3 = a.f10806b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str3);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str3);
            sb.append(":");
            sb.append(i3);
            Log.i("DynamiteModule", sb.toString());
            int i4 = a.f10807c;
            if (i4 == 0 || ((i4 == -1 && a.f10805a == 0) || (i4 == 1 && a.f10806b == 0))) {
                int i5 = a.f10805a;
                int i6 = a.f10806b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i5);
                sb2.append(" and remote version is ");
                sb2.append(i6);
                sb2.append(".");
                throw new C3379a(sb2.toString(), (C3382b) null);
            } else if (i4 == -1) {
                DynamiteModule i7 = m14493i(context2, str3);
                if (longValue == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(Long.valueOf(longValue));
                }
                Cursor cursor = fVar2.f10803a;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(fVar);
                return i7;
            } else if (i4 == 1) {
                try {
                    int i8 = a.f10806b;
                    try {
                        synchronized (cls) {
                            bool = f10794d;
                        }
                        if (bool != null) {
                            if (bool.booleanValue()) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 51);
                                sb3.append("Selected remote version of ");
                                sb3.append(str3);
                                sb3.append(", version >= ");
                                sb3.append(i8);
                                Log.i("DynamiteModule", sb3.toString());
                                synchronized (cls) {
                                    kVar = f10801k;
                                }
                                if (kVar != null) {
                                    C3386f fVar3 = threadLocal.get();
                                    if (fVar3 == null || fVar3.f10803a == null) {
                                        throw new C3379a("No result cursor", (C3382b) null);
                                    }
                                    Context applicationContext = context.getApplicationContext();
                                    Cursor cursor2 = fVar3.f10803a;
                                    C4865b.m20503f2(null);
                                    synchronized (cls) {
                                        valueOf = Boolean.valueOf(f10796f >= 2);
                                    }
                                    if (valueOf.booleanValue()) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        aVar2 = kVar.mo12012f2(C4865b.m20503f2(applicationContext), str3, i8, C4865b.m20503f2(cursor2));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        aVar2 = kVar.mo12011K0(C4865b.m20503f2(applicationContext), str3, i8, C4865b.m20503f2(cursor2));
                                    }
                                    Context context3 = (Context) C4865b.m20502K0(aVar2);
                                    if (context3 != null) {
                                        dynamiteModule = new DynamiteModule(context3);
                                    } else {
                                        throw new C3379a("Failed to get module context", (C3382b) null);
                                    }
                                } else {
                                    throw new C3379a("DynamiteLoaderV2 was not cached.", (C3382b) null);
                                }
                            } else {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 51);
                                sb4.append("Selected remote version of ");
                                sb4.append(str3);
                                sb4.append(", version >= ");
                                sb4.append(i8);
                                Log.i("DynamiteModule", sb4.toString());
                                C3390j k = m14495k(context);
                                if (k != null) {
                                    int o5 = k.mo12009o5();
                                    if (o5 >= 3) {
                                        C3386f fVar4 = threadLocal.get();
                                        if (fVar4 != null) {
                                            aVar = k.mo12006d7(C4865b.m20503f2(context), str3, i8, C4865b.m20503f2(fVar4.f10803a));
                                        } else {
                                            throw new C3379a("No cached result cursor holder", (C3382b) null);
                                        }
                                    } else if (o5 == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        aVar = k.mo12008l3(C4865b.m20503f2(context), str3, i8);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        aVar = k.mo12005K0(C4865b.m20503f2(context), str3, i8);
                                    }
                                    if (C4865b.m20502K0(aVar) != null) {
                                        dynamiteModule = new DynamiteModule((Context) C4865b.m20502K0(aVar));
                                    } else {
                                        throw new C3379a("Failed to load remote module.", (C3382b) null);
                                    }
                                } else {
                                    throw new C3379a("Failed to create IDynamiteLoader.", (C3382b) null);
                                }
                            }
                            if (longValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(longValue));
                            }
                            Cursor cursor3 = fVar2.f10803a;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            threadLocal.set(fVar);
                            return dynamiteModule;
                        }
                        throw new C3379a("Failed to determine which loading route to use.", (C3382b) null);
                    } catch (RemoteException e) {
                        throw new C3379a("Failed to load remote module.", e, (C3382b) null);
                    } catch (C3379a e2) {
                        throw e2;
                    } catch (Throwable th) {
                        C3361f.m14446a(context2, th);
                        throw new C3379a("Failed to load remote module.", th, (C3382b) null);
                    }
                } catch (C3379a e3) {
                    String valueOf2 = String.valueOf(e3.getMessage());
                    if (valueOf2.length() != 0) {
                        str2 = "Failed to load remote module: ".concat(valueOf2);
                    } else {
                        str2 = new String("Failed to load remote module: ");
                    }
                    Log.w("DynamiteModule", str2);
                    int i9 = a.f10805a;
                    if (i9 != 0) {
                        if (bVar.mo11999a(context2, str3, new C3387g(i9, 0)).f10807c == -1) {
                            DynamiteModule i10 = m14493i(context2, str3);
                            if (i != 0) {
                                f10798h.set(Long.valueOf(longValue));
                            }
                            return i10;
                        }
                    }
                    throw new C3379a("Remote load failed. No local fallback found.", e3, (C3382b) null);
                }
            } else {
                StringBuilder sb5 = new StringBuilder(47);
                sb5.append("VersionPolicy returned invalid code:");
                sb5.append(0);
                throw new C3379a(sb5.toString(), (C3382b) null);
            }
        } finally {
            if (longValue == 0) {
                f10798h.remove();
            } else {
                f10798h.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = fVar2.f10803a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f10797g.set(fVar);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x0095=Splitter:B:39:0x0095, B:23:0x0056=Splitter:B:23:0x0056, B:18:0x0039=Splitter:B:18:0x0039} */
    /* renamed from: f */
    public static int m14490f(@androidx.annotation.RecentlyNonNull android.content.Context r9, @androidx.annotation.RecentlyNonNull java.lang.String r10, boolean r11) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01b3 }
            java.lang.Boolean r1 = f10794d     // Catch:{ all -> 0x01b0 }
            r2 = 0
            if (r1 != 0) goto L_0x00d3
            android.content.Context r1 = r9.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00aa, IllegalAccessException -> 0x00a8, NoSuchFieldException -> 0x00a6 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00aa, IllegalAccessException -> 0x00a8, NoSuchFieldException -> 0x00a6 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r3 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r3 = r3.getName()     // Catch:{ ClassNotFoundException -> 0x00aa, IllegalAccessException -> 0x00a8, NoSuchFieldException -> 0x00a6 }
            java.lang.Class r1 = r1.loadClass(r3)     // Catch:{ ClassNotFoundException -> 0x00aa, IllegalAccessException -> 0x00a8, NoSuchFieldException -> 0x00a6 }
            java.lang.String r3 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ ClassNotFoundException -> 0x00aa, IllegalAccessException -> 0x00a8, NoSuchFieldException -> 0x00a6 }
            java.lang.Class r3 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00aa, IllegalAccessException -> 0x00a8, NoSuchFieldException -> 0x00a6 }
            monitor-enter(r3)     // Catch:{ ClassNotFoundException -> 0x00aa, IllegalAccessException -> 0x00a8, NoSuchFieldException -> 0x00a6 }
            java.lang.Object r4 = r1.get(r2)     // Catch:{ all -> 0x00a3 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x00a3 }
            if (r4 == 0) goto L_0x003c
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a3 }
            if (r4 != r1) goto L_0x0036
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a3 }
            goto L_0x00a1
        L_0x0036:
            m14494j(r4)     // Catch:{ a -> 0x0039 }
        L_0x0039:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a3 }
            goto L_0x00a1
        L_0x003c:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r9.getApplicationContext()     // Catch:{ all -> 0x00a3 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x00a3 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00a3 }
            if (r4 == 0) goto L_0x0056
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a3 }
            r1.set(r2, r4)     // Catch:{ all -> 0x00a3 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a3 }
            goto L_0x00a1
        L_0x0056:
            int r4 = m14491g(r9, r10, r11)     // Catch:{ a -> 0x0098 }
            java.lang.String r5 = f10795e     // Catch:{ a -> 0x0098 }
            if (r5 == 0) goto L_0x0095
            boolean r5 = r5.isEmpty()     // Catch:{ a -> 0x0098 }
            if (r5 == 0) goto L_0x0065
            goto L_0x0095
        L_0x0065:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x0098 }
            r6 = 29
            if (r5 < r6) goto L_0x007a
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x0098 }
            java.lang.String r6 = f10795e     // Catch:{ a -> 0x0098 }
            com.google.android.gms.common.internal.C3292l.m14240h(r6)     // Catch:{ a -> 0x0098 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0098 }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x0098 }
            goto L_0x0088
        L_0x007a:
            com.google.android.gms.dynamite.a r5 = new com.google.android.gms.dynamite.a     // Catch:{ a -> 0x0098 }
            java.lang.String r6 = f10795e     // Catch:{ a -> 0x0098 }
            com.google.android.gms.common.internal.C3292l.m14240h(r6)     // Catch:{ a -> 0x0098 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x0098 }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x0098 }
        L_0x0088:
            m14494j(r5)     // Catch:{ a -> 0x0098 }
            r1.set(r2, r5)     // Catch:{ a -> 0x0098 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ a -> 0x0098 }
            f10794d = r5     // Catch:{ a -> 0x0098 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r0)     // Catch:{ all -> 0x01b0 }
            return r4
        L_0x0095:
            monitor-exit(r3)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r0)     // Catch:{ all -> 0x01b0 }
            return r4
        L_0x0098:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a3 }
            r1.set(r2, r4)     // Catch:{ all -> 0x00a3 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a3 }
        L_0x00a1:
            monitor-exit(r3)     // Catch:{ all -> 0x00a3 }
            goto L_0x00d1
        L_0x00a3:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a3 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00aa, IllegalAccessException -> 0x00a8, NoSuchFieldException -> 0x00a6 }
        L_0x00a6:
            r1 = move-exception
            goto L_0x00ab
        L_0x00a8:
            r1 = move-exception
            goto L_0x00ab
        L_0x00aa:
            r1 = move-exception
        L_0x00ab:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x01b0 }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x01b0 }
            int r4 = r4.length()     // Catch:{ all -> 0x01b0 }
            int r4 = r4 + 30
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b0 }
            r5.<init>(r4)     // Catch:{ all -> 0x01b0 }
            java.lang.String r4 = "Failed to load module via V2: "
            r5.append(r4)     // Catch:{ all -> 0x01b0 }
            r5.append(r1)     // Catch:{ all -> 0x01b0 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x01b0 }
            android.util.Log.w(r3, r1)     // Catch:{ all -> 0x01b0 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01b0 }
        L_0x00d1:
            f10794d = r1     // Catch:{ all -> 0x01b0 }
        L_0x00d3:
            monitor-exit(r0)     // Catch:{ all -> 0x01b0 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01b3 }
            r1 = 0
            if (r0 == 0) goto L_0x0101
            int r9 = m14491g(r9, r10, r11)     // Catch:{ a -> 0x00e0 }
            return r9
        L_0x00e0:
            r10 = move-exception
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x01b3 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x01b3 }
            int r2 = r10.length()     // Catch:{ all -> 0x01b3 }
            if (r2 == 0) goto L_0x00f8
            java.lang.String r10 = r0.concat(r10)     // Catch:{ all -> 0x01b3 }
            goto L_0x00fd
        L_0x00f8:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x01b3 }
            r10.<init>(r0)     // Catch:{ all -> 0x01b3 }
        L_0x00fd:
            android.util.Log.w(r11, r10)     // Catch:{ all -> 0x01b3 }
            return r1
        L_0x0101:
            com.google.android.gms.dynamite.j r3 = m14495k(r9)     // Catch:{ all -> 0x01b3 }
            if (r3 != 0) goto L_0x0109
            goto L_0x01a9
        L_0x0109:
            int r0 = r3.mo12009o5()     // Catch:{ RemoteException -> 0x0183 }
            r4 = 3
            if (r0 < r4) goto L_0x015d
            f.f.b.a.b.a r4 = p159f.p243f.p245b.p246a.p248b.C4865b.m20503f2(r9)     // Catch:{ RemoteException -> 0x0183 }
            java.lang.ThreadLocal<java.lang.Long> r0 = f10798h     // Catch:{ RemoteException -> 0x0183 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0183 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0183 }
            long r7 = r0.longValue()     // Catch:{ RemoteException -> 0x0183 }
            r5 = r10
            r6 = r11
            f.f.b.a.b.a r10 = r3.mo12004F5(r4, r5, r6, r7)     // Catch:{ RemoteException -> 0x0183 }
            java.lang.Object r10 = p159f.p243f.p245b.p246a.p248b.C4865b.m20502K0(r10)     // Catch:{ RemoteException -> 0x0183 }
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch:{ RemoteException -> 0x0183 }
            if (r10 == 0) goto L_0x014a
            boolean r11 = r10.moveToFirst()     // Catch:{ RemoteException -> 0x015a, all -> 0x0157 }
            if (r11 != 0) goto L_0x0135
            goto L_0x014a
        L_0x0135:
            int r11 = r10.getInt(r1)     // Catch:{ RemoteException -> 0x015a, all -> 0x0157 }
            if (r11 <= 0) goto L_0x0142
            boolean r0 = m14492h(r10)     // Catch:{ RemoteException -> 0x015a, all -> 0x0157 }
            if (r0 == 0) goto L_0x0142
            goto L_0x0143
        L_0x0142:
            r2 = r10
        L_0x0143:
            if (r2 == 0) goto L_0x0148
            r2.close()     // Catch:{ all -> 0x01b3 }
        L_0x0148:
            r1 = r11
            goto L_0x01a9
        L_0x014a:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r0)     // Catch:{ RemoteException -> 0x015a, all -> 0x0157 }
            if (r10 == 0) goto L_0x01a9
            r10.close()     // Catch:{ all -> 0x01b3 }
            goto L_0x01a9
        L_0x0157:
            r11 = move-exception
            r2 = r10
            goto L_0x01aa
        L_0x015a:
            r11 = move-exception
            r2 = r10
            goto L_0x0185
        L_0x015d:
            r4 = 2
            if (r0 != r4) goto L_0x0170
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x0183 }
            f.f.b.a.b.a r0 = p159f.p243f.p245b.p246a.p248b.C4865b.m20503f2(r9)     // Catch:{ RemoteException -> 0x0183 }
            int r1 = r3.mo12010y3(r0, r10, r11)     // Catch:{ RemoteException -> 0x0183 }
            goto L_0x01a9
        L_0x0170:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x0183 }
            f.f.b.a.b.a r0 = p159f.p243f.p245b.p246a.p248b.C4865b.m20503f2(r9)     // Catch:{ RemoteException -> 0x0183 }
            int r1 = r3.mo12007f2(r0, r10, r11)     // Catch:{ RemoteException -> 0x0183 }
            goto L_0x01a9
        L_0x0180:
            r10 = move-exception
            r11 = r10
            goto L_0x01aa
        L_0x0183:
            r10 = move-exception
            r11 = r10
        L_0x0185:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x0180 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0180 }
            int r3 = r11.length()     // Catch:{ all -> 0x0180 }
            if (r3 == 0) goto L_0x019c
            java.lang.String r11 = r0.concat(r11)     // Catch:{ all -> 0x0180 }
            goto L_0x01a1
        L_0x019c:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0180 }
            r11.<init>(r0)     // Catch:{ all -> 0x0180 }
        L_0x01a1:
            android.util.Log.w(r10, r11)     // Catch:{ all -> 0x0180 }
            if (r2 == 0) goto L_0x01a9
            r2.close()     // Catch:{ all -> 0x01b3 }
        L_0x01a9:
            return r1
        L_0x01aa:
            if (r2 == 0) goto L_0x01af
            r2.close()     // Catch:{ all -> 0x01b3 }
        L_0x01af:
            throw r11     // Catch:{ all -> 0x01b3 }
        L_0x01b0:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01b0 }
            throw r10     // Catch:{ all -> 0x01b3 }
        L_0x01b3:
            r10 = move-exception
            com.google.android.gms.common.util.C3361f.m14446a(r9, r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m14490f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (m14492h(r9) != false) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a9  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m14491g(android.content.Context r9, java.lang.String r10, boolean r11) throws com.google.android.gms.dynamite.DynamiteModule.C3379a {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = f10798h     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r9 = "api_force_staging"
            java.lang.String r4 = "api"
            r5 = 1
            if (r5 == r11) goto L_0x0019
            r9 = r4
        L_0x0019:
            android.net.Uri$Builder r11 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r11.<init>()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r11 = r11.scheme(r4)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r11 = r11.authority(r4)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            android.net.Uri$Builder r9 = r11.path(r9)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            android.net.Uri$Builder r9 = r9.appendPath(r10)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            java.lang.String r10 = "requestStartTime"
            java.lang.String r11 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            android.net.Uri$Builder r9 = r9.appendQueryParameter(r10, r11)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            android.net.Uri r4 = r9.build()     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0095, all -> 0x0092 }
            if (r9 == 0) goto L_0x0081
            boolean r10 = r9.moveToFirst()     // Catch:{ Exception -> 0x0090 }
            if (r10 == 0) goto L_0x0081
            r10 = 0
            int r10 = r9.getInt(r10)     // Catch:{ Exception -> 0x0090 }
            if (r10 <= 0) goto L_0x007a
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r11 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r11)     // Catch:{ Exception -> 0x0090 }
            r1 = 2
            java.lang.String r1 = r9.getString(r1)     // Catch:{ all -> 0x0077 }
            f10795e = r1     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r9.getColumnIndex(r1)     // Catch:{ all -> 0x0077 }
            if (r1 < 0) goto L_0x006f
            int r1 = r9.getInt(r1)     // Catch:{ all -> 0x0077 }
            f10796f = r1     // Catch:{ all -> 0x0077 }
        L_0x006f:
            monitor-exit(r11)     // Catch:{ all -> 0x0077 }
            boolean r11 = m14492h(r9)     // Catch:{ Exception -> 0x0090 }
            if (r11 == 0) goto L_0x007a
            goto L_0x007b
        L_0x0077:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0077 }
            throw r10     // Catch:{ Exception -> 0x0090 }
        L_0x007a:
            r0 = r9
        L_0x007b:
            if (r0 == 0) goto L_0x0080
            r0.close()
        L_0x0080:
            return r10
        L_0x0081:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r11 = "Failed to retrieve remote module version."
            android.util.Log.w(r10, r11)     // Catch:{ Exception -> 0x0090 }
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x0090 }
            java.lang.String r11 = "Failed to connect to dynamite module ContentResolver."
            r10.<init>(r11, r0)     // Catch:{ Exception -> 0x0090 }
            throw r10     // Catch:{ Exception -> 0x0090 }
        L_0x0090:
            r10 = move-exception
            goto L_0x0098
        L_0x0092:
            r9 = move-exception
            r10 = r9
            goto L_0x00a7
        L_0x0095:
            r9 = move-exception
            r10 = r9
            r9 = r0
        L_0x0098:
            boolean r11 = r10 instanceof com.google.android.gms.dynamite.DynamiteModule.C3379a     // Catch:{ all -> 0x00a5 }
            if (r11 == 0) goto L_0x009d
            throw r10     // Catch:{ all -> 0x00a5 }
        L_0x009d:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = "V2 version check failed"
            r11.<init>(r1, r10, r0)     // Catch:{ all -> 0x00a5 }
            throw r11     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r10 = move-exception
            r0 = r9
        L_0x00a7:
            if (r0 == 0) goto L_0x00ac
            r0.close()
        L_0x00ac:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m14491g(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: h */
    private static boolean m14492h(Cursor cursor) {
        C3386f fVar = f10797g.get();
        if (fVar == null || fVar.f10803a != null) {
            return false;
        }
        fVar.f10803a = cursor;
        return true;
    }

    /* renamed from: i */
    private static DynamiteModule m14493i(Context context, String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Selected local version of ".concat(valueOf);
        } else {
            str2 = new String("Selected local version of ");
        }
        Log.i("DynamiteModule", str2);
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: j */
    private static void m14494j(ClassLoader classLoader) throws C3379a {
        C3391k kVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                kVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C3391k) {
                    kVar = (C3391k) queryLocalInterface;
                } else {
                    kVar = new C3391k(iBinder);
                }
            }
            f10801k = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C3379a("Failed to instantiate dynamite loader", e, (C3382b) null);
        }
    }

    /* renamed from: k */
    private static C3390j m14495k(Context context) {
        C3390j jVar;
        synchronized (DynamiteModule.class) {
            C3390j jVar2 = f10800j;
            if (jVar2 != null) {
                return jVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof C3390j) {
                        jVar = (C3390j) queryLocalInterface;
                    } else {
                        jVar = new C3390j(iBinder);
                    }
                }
                if (jVar != null) {
                    f10800j = jVar;
                    return jVar;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
        }
        return null;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public Context mo11997b() {
        return this.f10802a;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public IBinder mo11998d(@RecentlyNonNull String str) throws C3379a {
        try {
            return (IBinder) this.f10802a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new C3379a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, (C3382b) null);
        }
    }
}
