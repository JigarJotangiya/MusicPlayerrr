package p082e.p143q;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: e.q.a */
/* compiled from: MultiDex */
public final class C4107a {

    /* renamed from: a */
    private static final Set<File> f12386a = new HashSet();

    /* renamed from: b */
    private static final boolean f12387b = m18183n(System.getProperty("java.vm.version"));

    /* renamed from: e.q.a$a */
    /* compiled from: MultiDex */
    private static final class C4108a {

        /* renamed from: b */
        private static final int f12388b = 4;

        /* renamed from: a */
        private final C4109a f12389a;

        /* renamed from: e.q.a$a$a */
        /* compiled from: MultiDex */
        private interface C4109a {
            /* renamed from: a */
            Object mo14206a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
        }

        /* renamed from: e.q.a$a$b */
        /* compiled from: MultiDex */
        private static class C4110b implements C4109a {

            /* renamed from: a */
            private final Constructor<?> f12390a;

            C4110b(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
                this.f12390a = constructor;
                constructor.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo14206a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
                return this.f12390a.newInstance(new Object[]{file, new ZipFile(file), dexFile});
            }
        }

        /* renamed from: e.q.a$a$c */
        /* compiled from: MultiDex */
        private static class C4111c implements C4109a {

            /* renamed from: a */
            private final Constructor<?> f12391a;

            C4111c(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, File.class, DexFile.class});
                this.f12391a = constructor;
                constructor.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo14206a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.f12391a.newInstance(new Object[]{file, file, dexFile});
            }
        }

        /* renamed from: e.q.a$a$d */
        /* compiled from: MultiDex */
        private static class C4112d implements C4109a {

            /* renamed from: a */
            private final Constructor<?> f12392a;

            C4112d(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, Boolean.TYPE, File.class, DexFile.class});
                this.f12392a = constructor;
                constructor.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo14206a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.f12392a.newInstance(new Object[]{file, Boolean.FALSE, file, dexFile});
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C4108a() throws java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.NoSuchMethodException {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                e.q.a$a$b r1 = new e.q.a$a$b     // Catch:{ NoSuchMethodException -> 0x000f }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                e.q.a$a$c r1 = new e.q.a$a$c     // Catch:{ NoSuchMethodException -> 0x0015 }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                e.q.a$a$d r1 = new e.q.a$a$d
                r1.<init>(r0)
            L_0x001a:
                r2.f12389a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p143q.C4107a.C4108a.<init>():void");
        }

        /* renamed from: a */
        static void m18185a(ClassLoader classLoader, List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
            Object obj = C4107a.m18176g(classLoader, "pathList").get(classLoader);
            Object[] b = new C4108a().m18186b(list);
            try {
                C4107a.m18175f(obj, "dexElements", b);
            } catch (NoSuchFieldException e) {
                Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", e);
                C4107a.m18175f(obj, "pathElements", b);
            }
        }

        /* renamed from: b */
        private Object[] m18186b(List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = (File) list.get(i);
                objArr[i] = this.f12389a.mo14206a(file, DexFile.loadDex(file.getPath(), m18187c(file), 0));
            }
            return objArr;
        }

        /* renamed from: c */
        private static String m18187c(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - f12388b) + ".dex").getPath();
        }
    }

    /* renamed from: e.q.a$b */
    /* compiled from: MultiDex */
    private static final class C4113b {
        /* renamed from: a */
        static void m18192a(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = C4107a.m18176g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            C4107a.m18175f(obj, "dexElements", m18193b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field a = C4107a.m18176g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) a.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                a.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        /* renamed from: b */
        private static Object[] m18193b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[]) C4107a.m18177h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    /* renamed from: e.q.a$c */
    /* compiled from: MultiDex */
    private static final class C4114c {
        /* renamed from: a */
        static void m18194a(ClassLoader classLoader, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            Field a = C4107a.m18176g(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) a.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            a.set(classLoader, sb.toString());
            C4107a.m18175f(classLoader, "mPaths", strArr);
            C4107a.m18175f(classLoader, "mFiles", fileArr);
            C4107a.m18175f(classLoader, "mZips", zipFileArr);
            C4107a.m18175f(classLoader, "mDexs", dexFileArr);
        }
    }

    /* renamed from: d */
    private static void m18173d(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (!file2.delete()) {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                } else {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                }
            }
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
                return;
            }
            Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:41|42|43|44|45) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0097 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m18174e(android.content.Context r6, java.io.File r7, java.io.File r8, java.lang.String r9, java.lang.String r10, boolean r11) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.util.Set<java.io.File> r0 = f12386a
            monitor-enter(r0)
            boolean r1 = r0.contains(r7)     // Catch:{ all -> 0x0098 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            return
        L_0x000b:
            r0.add(r7)     // Catch:{ all -> 0x0098 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0098 }
            r2 = 20
            if (r1 <= r2) goto L_0x004f
            java.lang.String r3 = "MultiDex"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r4.<init>()     // Catch:{ all -> 0x0098 }
            java.lang.String r5 = "MultiDex is not guaranteed to work in SDK version "
            r4.append(r5)     // Catch:{ all -> 0x0098 }
            r4.append(r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = ": SDK version higher than "
            r4.append(r1)     // Catch:{ all -> 0x0098 }
            r4.append(r2)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = " should be backed by "
            r4.append(r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "runtime with built-in multidex capabilty but it's not the "
            r4.append(r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "case here: java.vm.version=\""
            r4.append(r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ all -> 0x0098 }
            r4.append(r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "\""
            r4.append(r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0098 }
            android.util.Log.w(r3, r1)     // Catch:{ all -> 0x0098 }
        L_0x004f:
            java.lang.ClassLoader r1 = m18179j(r6)     // Catch:{ all -> 0x0098 }
            if (r1 != 0) goto L_0x0057
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            return
        L_0x0057:
            m18173d(r6)     // Catch:{ all -> 0x005b }
            goto L_0x0063
        L_0x005b:
            r2 = move-exception
            java.lang.String r3 = "MultiDex"
            java.lang.String r4 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r3, r4, r2)     // Catch:{ all -> 0x0098 }
        L_0x0063:
            java.io.File r8 = m18180k(r6, r8, r9)     // Catch:{ all -> 0x0098 }
            e.q.b r9 = new e.q.b     // Catch:{ all -> 0x0098 }
            r9.<init>(r7, r8)     // Catch:{ all -> 0x0098 }
            r7 = 0
            r2 = 0
            java.util.List r2 = r9.mo14207Q(r6, r10, r2)     // Catch:{ all -> 0x0093 }
            m18182m(r1, r8, r2)     // Catch:{ IOException -> 0x0076 }
            goto L_0x0088
        L_0x0076:
            r2 = move-exception
            if (r11 == 0) goto L_0x0092
            java.lang.String r11 = "MultiDex"
            java.lang.String r3 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r11, r3, r2)     // Catch:{ all -> 0x0093 }
            r11 = 1
            java.util.List r6 = r9.mo14207Q(r6, r10, r11)     // Catch:{ all -> 0x0093 }
            m18182m(r1, r8, r6)     // Catch:{ all -> 0x0093 }
        L_0x0088:
            r9.close()     // Catch:{ IOException -> 0x008c }
            goto L_0x008d
        L_0x008c:
            r7 = move-exception
        L_0x008d:
            if (r7 != 0) goto L_0x0091
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            return
        L_0x0091:
            throw r7     // Catch:{ all -> 0x0098 }
        L_0x0092:
            throw r2     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r6 = move-exception
            r9.close()     // Catch:{ IOException -> 0x0097 }
        L_0x0097:
            throw r6     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p143q.C4107a.m18174e(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m18175f(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field g = m18176g(obj, str);
        Object[] objArr2 = (Object[]) g.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        g.set(obj, objArr3);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static Field m18176g(Object obj, String str) throws NoSuchFieldException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static Method m18177h(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* renamed from: i */
    private static ApplicationInfo m18178i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    /* renamed from: j */
    private static ClassLoader m18179j(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            if (Build.VERSION.SDK_INT >= 14) {
                if (classLoader instanceof BaseDexClassLoader) {
                    return classLoader;
                }
            } else if ((classLoader instanceof DexClassLoader) || (classLoader instanceof PathClassLoader)) {
                return classLoader;
            }
            Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
            return null;
        } catch (RuntimeException e) {
            Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    /* renamed from: k */
    private static File m18180k(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            m18184o(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m18184o(file2);
        }
        File file3 = new File(file2, str);
        m18184o(file3);
        return file3;
    }

    /* renamed from: l */
    public static void m18181l(Context context) {
        Log.i("MultiDex", "Installing application");
        if (f12387b) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 4) {
            try {
                ApplicationInfo i2 = m18178i(context);
                if (i2 == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                }
                m18174e(context, new File(i2.sourceDir), new File(i2.dataDir), "secondary-dexes", BuildConfig.FLAVOR, true);
                Log.i("MultiDex", "install done");
            } catch (Exception e) {
                Log.e("MultiDex", "MultiDex installation failure", e);
                throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
            }
        } else {
            throw new RuntimeException("MultiDex installation failed. SDK " + i + " is unsupported. Min SDK version is " + 4 + ".");
        }
    }

    /* renamed from: m */
    private static void m18182m(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        if (!list.isEmpty()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                C4113b.m18192a(classLoader, list, file);
            } else if (i >= 14) {
                C4108a.m18185a(classLoader, list);
            } else {
                C4114c.m18194a(classLoader, list);
            }
        }
    }

    /* renamed from: n */
    static boolean m18183n(String str) {
        boolean z = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String str2 = null;
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            }
            if (!(nextToken == null || str2 == null)) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(str2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb.toString());
        return z;
    }

    /* renamed from: o */
    private static void m18184o(File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
            } else {
                Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
}
