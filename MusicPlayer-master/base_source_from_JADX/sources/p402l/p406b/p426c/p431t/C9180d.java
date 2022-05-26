package p402l.p406b.p426c.p431t;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.logging.Logger;
import p402l.p406b.p407a.C8942a;
import p402l.p406b.p407a.p413g.C9025k;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9122b;
import p402l.p406b.p426c.C9123c;
import p402l.p406b.p426c.C9128h;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.C9132l;
import p402l.p406b.p426c.p429r.C9159n;
import p402l.p406b.p426c.p429r.C9160o;
import p402l.p406b.p426c.p431t.p432k0.C9199a;
import p402l.p406b.p426c.p431t.p432k0.C9200a0;
import p402l.p406b.p426c.p431t.p432k0.C9202b0;
import p402l.p406b.p426c.p431t.p432k0.C9205d;
import p402l.p406b.p426c.p431t.p432k0.C9208f;
import p402l.p406b.p426c.p431t.p432k0.C9209g;
import p402l.p406b.p426c.p431t.p432k0.C9210h;
import p402l.p406b.p426c.p431t.p432k0.C9218p;
import p402l.p406b.p426c.p431t.p432k0.C9222t;
import p402l.p406b.p426c.p431t.p432k0.C9223u;
import p402l.p406b.p426c.p431t.p432k0.C9224v;
import p402l.p406b.p426c.p431t.p432k0.C9226x;
import p402l.p406b.p426c.p431t.p432k0.C9227y;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.d */
/* compiled from: AbstractID3v2Tag */
public abstract class C9180d extends C9172a implements C9130j {

    /* renamed from: q */
    protected static final byte[] f35836q = {73, 68, 51};

    /* renamed from: j */
    public HashMap<String, Object> f35837j = null;

    /* renamed from: k */
    public HashMap<String, Object> f35838k = null;

    /* renamed from: l */
    protected String f35839l = BuildConfig.FLAVOR;

    /* renamed from: m */
    protected int f35840m = 0;

    /* renamed from: n */
    protected int f35841n = 0;

    /* renamed from: o */
    protected int f35842o = 0;

    /* renamed from: p */
    protected int f35843p = 0;

    /* renamed from: l.b.c.t.d$a */
    /* compiled from: AbstractID3v2Tag */
    class C9181a implements Iterator<C9132l> {

        /* renamed from: g */
        private Iterator<C9132l> f35844g;

        /* renamed from: h */
        final /* synthetic */ Iterator f35845h;

        /* renamed from: i */
        final /* synthetic */ Iterator f35846i;

        C9181a(C9180d dVar, Iterator it, Iterator it2) {
            this.f35845h = it;
            this.f35846i = it2;
        }

        /* renamed from: a */
        private void m48821a() {
            if (this.f35845h.hasNext()) {
                while (this.f35845h.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f35845h.next();
                    Map.Entry entry2 = (Map.Entry) this.f35846i.next();
                    if (entry.getValue() instanceof List) {
                        List list = (List) entry.getValue();
                        if (list.size() != 0) {
                            this.f35844g = list.iterator();
                            return;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add((C9132l) entry.getValue());
                        this.f35844g = arrayList.iterator();
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public C9132l next() {
            if (this.f35844g == null) {
                m48821a();
            }
            Iterator<C9132l> it = this.f35844g;
            if (it != null && !it.hasNext()) {
                m48821a();
            }
            Iterator<C9132l> it2 = this.f35844g;
            if (it2 != null) {
                return it2.next();
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            Iterator<C9132l> it = this.f35844g;
            if (it != null && it.hasNext()) {
                return true;
            }
            if (!this.f35846i.hasNext()) {
                return false;
            }
            return this.f35846i.hasNext();
        }

        public void remove() {
            this.f35844g.remove();
        }
    }

    /* renamed from: l.b.c.t.d$b */
    /* compiled from: AbstractID3v2Tag */
    class C9182b {

        /* renamed from: a */
        private String f35847a;

        /* renamed from: b */
        private String f35848b;

        public C9182b(C9180d dVar, String str, String str2) {
            this.f35847a = str;
            this.f35848b = str2;
        }

        /* renamed from: a */
        public String mo31911a() {
            return this.f35847a;
        }

        /* renamed from: b */
        public String mo31912b() {
            return this.f35848b;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m48787F(java.io.File r6) throws java.io.IOException {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x005b }
            r1.<init>(r6)     // Catch:{ all -> 0x005b }
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch:{ all -> 0x0059 }
            r6 = 10
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r6)     // Catch:{ all -> 0x0059 }
            r0.read(r2)     // Catch:{ all -> 0x0059 }
            r2.flip()     // Catch:{ all -> 0x0059 }
            int r3 = r2.limit()     // Catch:{ all -> 0x0059 }
            r4 = 0
            if (r3 >= r6) goto L_0x0027
            if (r0 == 0) goto L_0x0023
            r0.close()
        L_0x0023:
            r1.close()
            return r4
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            r0.close()
        L_0x002c:
            r1.close()
            r0 = 3
            byte[] r1 = new byte[r0]
            r3 = 0
            r2.get(r1, r3, r0)
            byte[] r3 = f35836q
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 != 0) goto L_0x003f
            return r4
        L_0x003f:
            byte r1 = r2.get()
            r3 = 2
            if (r1 == r3) goto L_0x004c
            if (r1 == r0) goto L_0x004c
            r0 = 4
            if (r1 == r0) goto L_0x004c
            return r4
        L_0x004c:
            r2.get()
            r2.get()
            int r0 = p402l.p406b.p426c.p431t.C9229l.m49050a(r2)
            int r0 = r0 + r6
            long r0 = (long) r0
            return r0
        L_0x0059:
            r6 = move-exception
            goto L_0x005d
        L_0x005b:
            r6 = move-exception
            r1 = r0
        L_0x005d:
            if (r0 == 0) goto L_0x0062
            r0.close()
        L_0x0062:
            if (r1 == 0) goto L_0x0067
            r1.close()
        L_0x0067:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p426c.p431t.C9180d.m48787F(java.io.File):long");
    }

    /* renamed from: G */
    private static boolean m48788G(RandomAccessFile randomAccessFile) throws IOException {
        long filePointer = randomAccessFile.getFilePointer();
        byte[] bArr = new byte[3];
        randomAccessFile.read(bArr);
        randomAccessFile.seek(filePointer);
        return Arrays.equals(bArr, f35836q);
    }

    /* renamed from: H */
    public static boolean m48789H(RandomAccessFile randomAccessFile) throws IOException {
        if (!m48788G(randomAccessFile)) {
            return false;
        }
        byte[] bArr = new byte[4];
        randomAccessFile.seek(randomAccessFile.getFilePointer() + 6);
        randomAccessFile.read(bArr);
        randomAccessFile.seek((long) (C9229l.m49050a(ByteBuffer.wrap(bArr)) + 10));
        return true;
    }

    /* renamed from: M */
    private void m48790M(File file, File file2) throws IOException {
        String path = file.getAbsoluteFile().getParentFile().getPath();
        File file3 = new File(path, C8942a.m47874f(file) + ".old");
        int i = 1;
        while (file3.exists()) {
            String path2 = file.getAbsoluteFile().getParentFile().getPath();
            file3 = new File(path2, C8942a.m47874f(file) + ".old" + i);
            i++;
        }
        if (!file.renameTo(file3)) {
            Logger logger = C9172a.f35808i;
            C9118b bVar = C9118b.GENERAL_WRITE_FAILED_TO_RENAME_ORIGINAL_FILE_TO_BACKUP;
            logger.warning(bVar.getMsg(file.getAbsolutePath(), file3.getName()));
            file2.delete();
            throw new C9025k(bVar.getMsg(file.getAbsolutePath(), file3.getName()));
        } else if (!file2.renameTo(file)) {
            if (!file2.exists()) {
                C9172a.f35808i.warning(C9118b.GENERAL_WRITE_FAILED_NEW_FILE_DOESNT_EXIST.getMsg(file2.getAbsolutePath()));
            }
            if (!file3.renameTo(file)) {
                C9172a.f35808i.warning(C9118b.GENERAL_WRITE_FAILED_TO_RENAME_ORIGINAL_BACKUP_TO_ORIGINAL.getMsg(file3.getAbsolutePath(), file.getName()));
            }
            Logger logger2 = C9172a.f35808i;
            C9118b bVar2 = C9118b.GENERAL_WRITE_FAILED_TO_RENAME_TO_ORIGINAL_FILE;
            logger2.warning(bVar2.getMsg(file.getAbsolutePath(), file2.getName()));
            file2.delete();
            throw new C9025k(bVar2.getMsg(file.getAbsolutePath(), file2.getName()));
        } else if (!file3.delete()) {
            C9172a.f35808i.warning(C9118b.GENERAL_WRITE_WARNING_UNABLE_TO_DELETE_BACKUP_FILE.getMsg(file3.getAbsolutePath()));
        }
    }

    /* renamed from: S */
    private void m48791S(Map map, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        TreeSet treeSet = new TreeSet(mo31879E());
        treeSet.addAll(map.keySet());
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            Object obj = map.get((String) it.next());
            if (obj instanceof C9176c) {
                C9176c cVar = (C9176c) obj;
                cVar.mo31868v(mo31847k());
                cVar.mo31869w(byteArrayOutputStream);
            } else if (obj instanceof C9194i) {
                for (C9176c next : ((C9194i) obj).mo31957b()) {
                    next.mo31868v(mo31847k());
                    next.mo31869w(byteArrayOutputStream);
                }
            } else {
                for (C9176c cVar2 : (List) obj) {
                    cVar2.mo31868v(mo31847k());
                    cVar2.mo31869w(byteArrayOutputStream);
                }
            }
        }
    }

    /* renamed from: A */
    public Object mo31891A(String str) {
        return this.f35837j.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract C9182b mo31877B(C9123c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract C9198k mo31878C();

    /* renamed from: E */
    public abstract Comparator mo31879E();

    /* renamed from: I */
    public Iterator mo31892I() {
        return this.f35837j.values().iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo31880J(String str, C9176c cVar) {
        if (cVar.mo31934j() instanceof C9208f) {
            mo31881K(this.f35838k, str, cVar);
        } else {
            mo31881K(this.f35837j, str, cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo31881K(HashMap hashMap, String str, C9176c cVar) {
        if (C9189f0.m48856k().mo31960g(str) || C9173a0.m48741k().mo31960g(str) || C9249v.m49141k().mo31960g(str)) {
            if (hashMap.containsKey(str)) {
                Object obj = hashMap.get(str);
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(cVar);
                    C9172a.f35808i.finer("Adding Multi Frame(1)" + str);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add((C9176c) obj);
                arrayList.add(cVar);
                hashMap.put(str, arrayList);
                C9172a.f35808i.finer("Adding Multi Frame(2)" + str);
                return;
            }
            C9172a.f35808i.finer("Adding Multi FrameList(3)" + str);
            hashMap.put(str, cVar);
        } else if (hashMap.containsKey(str)) {
            C9172a.f35808i.warning("Ignoring Duplicate Frame:" + str);
            if (this.f35839l.length() > 0) {
                this.f35839l += ";";
            }
            this.f35839l += str;
            this.f35840m += ((C9176c) this.f35837j.get(str)).mo31919h();
        } else {
            C9172a.f35808i.finer("Adding Frame" + str);
            hashMap.put(str, cVar);
        }
    }

    /* renamed from: L */
    public void mo31893L(C9176c cVar, List<C9176c> list) {
        ListIterator<C9176c> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C9176c next = listIterator.next();
            if (cVar.mo31934j() instanceof C9224v) {
                if (((C9224v) cVar.mo31934j()).mo32022A().equals(((C9224v) next.mo31934j()).mo32022A())) {
                    listIterator.set(cVar);
                    this.f35837j.put(cVar.mo31497D(), list);
                    return;
                }
            } else if (cVar.mo31934j() instanceof C9202b0) {
                if (((C9202b0) cVar.mo31934j()).mo31967A().equals(((C9202b0) next.mo31934j()).mo31967A())) {
                    listIterator.set(cVar);
                    this.f35837j.put(cVar.mo31497D(), list);
                    return;
                }
            } else if (cVar.mo31934j() instanceof C9205d) {
                if (((C9205d) cVar.mo31934j()).mo31974x().equals(((C9205d) next.mo31934j()).mo31974x())) {
                    listIterator.set(cVar);
                    this.f35837j.put(cVar.mo31497D(), list);
                    return;
                }
            } else if (cVar.mo31934j() instanceof C9226x) {
                if (((C9226x) cVar.mo31934j()).mo32024x().equals(((C9226x) next.mo31934j()).mo32024x())) {
                    listIterator.set(cVar);
                    this.f35837j.put(cVar.mo31497D(), list);
                    return;
                }
            } else if (cVar.mo31934j() instanceof C9227y) {
                if (((C9227y) cVar.mo31934j()).mo32031y().equals(((C9227y) next.mo31934j()).mo32031y())) {
                    listIterator.set(cVar);
                    this.f35837j.put(cVar.mo31497D(), list);
                    return;
                }
            } else if (cVar.mo31934j() instanceof C9210h) {
                if (((C9210h) cVar.mo31934j()).mo31986y().equals(((C9210h) next.mo31934j()).mo31986y())) {
                    listIterator.set(cVar);
                    this.f35837j.put(cVar.mo31497D(), list);
                    return;
                }
            } else if (cVar.mo31934j() instanceof C9223u) {
                C9223u uVar = (C9223u) cVar.mo31934j();
                C9223u uVar2 = (C9223u) next.mo31934j();
                if (uVar.mo32019x() != null && uVar.mo32019x().intValue() > 0) {
                    uVar2.mo32017B(uVar.mo32020y());
                }
                if (uVar.mo32021z() != null && uVar.mo32021z().intValue() > 0) {
                    uVar2.mo32018C(uVar.mo32016A());
                    return;
                }
                return;
            } else if (cVar.mo31934j() instanceof C9222t) {
                C9222t tVar = (C9222t) cVar.mo31934j();
                C9222t tVar2 = (C9222t) next.mo31934j();
                Integer x = tVar.mo32013x();
                if (x != null && x.intValue() > 0) {
                    tVar2.mo32011B(tVar.mo32014y());
                }
                Integer z = tVar.mo32015z();
                if (z != null && z.intValue() > 0) {
                    tVar2.mo32012C(tVar.mo32010A());
                    return;
                }
                return;
            } else if (cVar.mo31934j() instanceof C9209g) {
                ((C9209g) next.mo31934j()).mo31979x(((C9209g) cVar.mo31934j()).mo31978A());
                return;
            } else if (cVar.mo31934j() instanceof C9218p) {
                ((C9218p) next.mo31934j()).mo32007x(((C9218p) cVar.mo31934j()).mo32006B());
                return;
            }
        }
        if (!mo31878C().mo31960g(cVar.mo31497D())) {
            this.f35837j.put(cVar.mo31497D(), cVar);
            return;
        }
        list.add(cVar);
        this.f35837j.put(cVar.mo31497D(), list);
    }

    /* renamed from: N */
    public boolean mo31894N(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        Logger logger = C9172a.f35808i;
        logger.config("ByteBuffer pos:" + byteBuffer.position() + ":limit" + byteBuffer.limit() + ":cap" + byteBuffer.capacity());
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr, 0, 3);
        if (Arrays.equals(bArr, f35836q) && byteBuffer.get() == mo31848l() && byteBuffer.get() == mo31849m()) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public void mo31895O(C9132l lVar) throws C9122b {
        boolean z = lVar instanceof C9176c;
        if (!z && !(lVar instanceof C9194i)) {
            throw new C9122b("Field " + lVar + " is not of type AbstractID3v2Frame nor AggregatedFrame");
        } else if (z) {
            C9176c cVar = (C9176c) lVar;
            Object obj = this.f35837j.get(lVar.mo31497D());
            if (obj == null) {
                this.f35837j.put(lVar.mo31497D(), lVar);
            } else if (obj instanceof C9176c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((C9176c) obj);
                mo31893L(cVar, arrayList);
            } else if (obj instanceof List) {
                mo31893L(cVar, (List) obj);
            }
        } else {
            this.f35837j.put(lVar.mo31497D(), lVar);
        }
    }

    /* renamed from: P */
    public abstract long mo31882P(File file, long j) throws IOException;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.nio.channels.FileLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.nio.channels.FileLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.nio.channels.FileLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.nio.channels.FileLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.nio.channels.FileLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.nio.channels.FileChannel} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085 A[Catch:{ FileNotFoundException -> 0x00df, IOException -> 0x0055, all -> 0x0051, all -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b2 A[Catch:{ FileNotFoundException -> 0x00df, IOException -> 0x0055, all -> 0x0051, all -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x010f A[Catch:{ FileNotFoundException -> 0x00df, IOException -> 0x0055, all -> 0x0051, all -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0134 A[Catch:{ FileNotFoundException -> 0x00df, IOException -> 0x0055, all -> 0x0051, all -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015c  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31896Q(java.io.File r4, java.nio.ByteBuffer r5, byte[] r6, int r7, int r8, long r9) throws java.io.IOException {
        /*
            r3 = this;
            long r0 = (long) r8
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x000f
            java.util.logging.Logger r0 = p402l.p406b.p426c.p431t.C9172a.f35808i
            java.lang.String r1 = "Adjusting Padding"
            r0.finest(r1)
            r3.mo31898p(r4, r8, r9)
        L_0x000f:
            r8 = 0
            r9 = 0
            r10 = 1
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x00df, IOException -> 0x0055, all -> 0x0051 }
            java.lang.String r1 = "rw"
            r0.<init>(r4, r1)     // Catch:{ FileNotFoundException -> 0x00df, IOException -> 0x0055, all -> 0x0051 }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ FileNotFoundException -> 0x00df, IOException -> 0x0055, all -> 0x0051 }
            java.lang.String r1 = r4.getPath()     // Catch:{ FileNotFoundException -> 0x004c, IOException -> 0x0048, all -> 0x0043 }
            java.nio.channels.FileLock r8 = r3.mo31906z(r0, r1)     // Catch:{ FileNotFoundException -> 0x004c, IOException -> 0x0048, all -> 0x0043 }
            r0.write(r5)     // Catch:{ FileNotFoundException -> 0x004c, IOException -> 0x0048, all -> 0x0043 }
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r6)     // Catch:{ FileNotFoundException -> 0x004c, IOException -> 0x0048, all -> 0x0043 }
            r0.write(r5)     // Catch:{ FileNotFoundException -> 0x004c, IOException -> 0x0048, all -> 0x0043 }
            byte[] r5 = new byte[r7]     // Catch:{ FileNotFoundException -> 0x004c, IOException -> 0x0048, all -> 0x0043 }
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)     // Catch:{ FileNotFoundException -> 0x004c, IOException -> 0x0048, all -> 0x0043 }
            r0.write(r5)     // Catch:{ FileNotFoundException -> 0x004c, IOException -> 0x0048, all -> 0x0043 }
            if (r0 == 0) goto L_0x0042
            if (r8 == 0) goto L_0x003f
            r8.release()
        L_0x003f:
            r0.close()
        L_0x0042:
            return
        L_0x0043:
            r4 = move-exception
            r6 = r8
            r8 = r0
            goto L_0x015a
        L_0x0048:
            r5 = move-exception
            r6 = r8
            r8 = r0
            goto L_0x0057
        L_0x004c:
            r5 = move-exception
            r6 = r8
            r8 = r0
            goto L_0x00e1
        L_0x0051:
            r4 = move-exception
            r6 = r8
            goto L_0x015a
        L_0x0055:
            r5 = move-exception
            r6 = r8
        L_0x0057:
            java.util.logging.Logger r7 = p402l.p406b.p426c.p431t.C9172a.f35808i     // Catch:{ all -> 0x0159 }
            java.util.logging.Level r0 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x0159 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0159 }
            r1.<init>()     // Catch:{ all -> 0x0159 }
            java.lang.String r2 = r3.mo31847k()     // Catch:{ all -> 0x0159 }
            r1.append(r2)     // Catch:{ all -> 0x0159 }
            java.lang.String r2 = r5.getMessage()     // Catch:{ all -> 0x0159 }
            r1.append(r2)     // Catch:{ all -> 0x0159 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0159 }
            r7.log(r0, r1, r5)     // Catch:{ all -> 0x0159 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0159 }
            l.b.b.c r7 = p402l.p406b.p425b.C9119c.ACCESS_IS_DENIED     // Catch:{ all -> 0x0159 }
            java.lang.String r7 = r7.getMsg()     // Catch:{ all -> 0x0159 }
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x0159 }
            if (r5 == 0) goto L_0x00b2
            java.util.logging.Logger r5 = p402l.p406b.p426c.p431t.C9172a.f35808i     // Catch:{ all -> 0x0159 }
            l.b.b.b r7 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_OPEN_FILE_FOR_EDITING     // Catch:{ all -> 0x0159 }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ all -> 0x0159 }
            java.io.File r1 = r4.getParentFile()     // Catch:{ all -> 0x0159 }
            java.lang.String r1 = r1.getPath()     // Catch:{ all -> 0x0159 }
            r0[r9] = r1     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = r7.getMsg(r0)     // Catch:{ all -> 0x0159 }
            r5.severe(r0)     // Catch:{ all -> 0x0159 }
            l.b.a.g.j r5 = new l.b.a.g.j     // Catch:{ all -> 0x0159 }
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x0159 }
            java.io.File r4 = r4.getParentFile()     // Catch:{ all -> 0x0159 }
            java.lang.String r4 = r4.getPath()     // Catch:{ all -> 0x0159 }
            r10[r9] = r4     // Catch:{ all -> 0x0159 }
            java.lang.String r4 = r7.getMsg(r10)     // Catch:{ all -> 0x0159 }
            r5.<init>(r4)     // Catch:{ all -> 0x0159 }
            throw r5     // Catch:{ all -> 0x0159 }
        L_0x00b2:
            java.util.logging.Logger r5 = p402l.p406b.p426c.p431t.C9172a.f35808i     // Catch:{ all -> 0x0159 }
            l.b.b.b r7 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_OPEN_FILE_FOR_EDITING     // Catch:{ all -> 0x0159 }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ all -> 0x0159 }
            java.io.File r1 = r4.getParentFile()     // Catch:{ all -> 0x0159 }
            java.lang.String r1 = r1.getPath()     // Catch:{ all -> 0x0159 }
            r0[r9] = r1     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = r7.getMsg(r0)     // Catch:{ all -> 0x0159 }
            r5.severe(r0)     // Catch:{ all -> 0x0159 }
            l.b.a.g.i r5 = new l.b.a.g.i     // Catch:{ all -> 0x0159 }
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x0159 }
            java.io.File r4 = r4.getParentFile()     // Catch:{ all -> 0x0159 }
            java.lang.String r4 = r4.getPath()     // Catch:{ all -> 0x0159 }
            r10[r9] = r4     // Catch:{ all -> 0x0159 }
            java.lang.String r4 = r7.getMsg(r10)     // Catch:{ all -> 0x0159 }
            r5.<init>(r4)     // Catch:{ all -> 0x0159 }
            throw r5     // Catch:{ all -> 0x0159 }
        L_0x00df:
            r5 = move-exception
            r6 = r8
        L_0x00e1:
            java.util.logging.Logger r7 = p402l.p406b.p426c.p431t.C9172a.f35808i     // Catch:{ all -> 0x0159 }
            java.util.logging.Level r0 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x0159 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0159 }
            r1.<init>()     // Catch:{ all -> 0x0159 }
            java.lang.String r2 = r3.mo31847k()     // Catch:{ all -> 0x0159 }
            r1.append(r2)     // Catch:{ all -> 0x0159 }
            java.lang.String r2 = r5.getMessage()     // Catch:{ all -> 0x0159 }
            r1.append(r2)     // Catch:{ all -> 0x0159 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0159 }
            r7.log(r0, r1, r5)     // Catch:{ all -> 0x0159 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0159 }
            l.b.b.c r7 = p402l.p406b.p425b.C9119c.ACCESS_IS_DENIED     // Catch:{ all -> 0x0159 }
            java.lang.String r7 = r7.getMsg()     // Catch:{ all -> 0x0159 }
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x0159 }
            if (r5 == 0) goto L_0x0134
            java.util.logging.Logger r5 = p402l.p406b.p426c.p431t.C9172a.f35808i     // Catch:{ all -> 0x0159 }
            l.b.b.b r7 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_OPEN_FILE_FOR_EDITING     // Catch:{ all -> 0x0159 }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ all -> 0x0159 }
            java.lang.String r1 = r4.getPath()     // Catch:{ all -> 0x0159 }
            r0[r9] = r1     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = r7.getMsg(r0)     // Catch:{ all -> 0x0159 }
            r5.severe(r0)     // Catch:{ all -> 0x0159 }
            l.b.a.g.j r5 = new l.b.a.g.j     // Catch:{ all -> 0x0159 }
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x0159 }
            java.lang.String r4 = r4.getPath()     // Catch:{ all -> 0x0159 }
            r10[r9] = r4     // Catch:{ all -> 0x0159 }
            java.lang.String r4 = r7.getMsg(r10)     // Catch:{ all -> 0x0159 }
            r5.<init>(r4)     // Catch:{ all -> 0x0159 }
            throw r5     // Catch:{ all -> 0x0159 }
        L_0x0134:
            java.util.logging.Logger r5 = p402l.p406b.p426c.p431t.C9172a.f35808i     // Catch:{ all -> 0x0159 }
            l.b.b.b r7 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_OPEN_FILE_FOR_EDITING     // Catch:{ all -> 0x0159 }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ all -> 0x0159 }
            java.lang.String r1 = r4.getPath()     // Catch:{ all -> 0x0159 }
            r0[r9] = r1     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = r7.getMsg(r0)     // Catch:{ all -> 0x0159 }
            r5.severe(r0)     // Catch:{ all -> 0x0159 }
            l.b.a.g.i r5 = new l.b.a.g.i     // Catch:{ all -> 0x0159 }
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x0159 }
            java.lang.String r4 = r4.getPath()     // Catch:{ all -> 0x0159 }
            r10[r9] = r4     // Catch:{ all -> 0x0159 }
            java.lang.String r4 = r7.getMsg(r10)     // Catch:{ all -> 0x0159 }
            r5.<init>(r4)     // Catch:{ all -> 0x0159 }
            throw r5     // Catch:{ all -> 0x0159 }
        L_0x0159:
            r4 = move-exception
        L_0x015a:
            if (r8 == 0) goto L_0x0164
            if (r6 == 0) goto L_0x0161
            r6.release()
        L_0x0161:
            r8.close()
        L_0x0164:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p426c.p431t.C9180d.mo31896Q(java.io.File, java.nio.ByteBuffer, byte[], int, int, long):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public ByteArrayOutputStream mo31897R() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m48791S(this.f35837j, byteArrayOutputStream);
        m48791S(this.f35838k, byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /* renamed from: a */
    public List<C9132l> mo31559a(C9123c cVar) throws C9128h {
        if (cVar != null) {
            C9182b B = mo31877B(cVar);
            List<C9132l> y = mo31905y(B.mo31911a());
            ArrayList arrayList = new ArrayList();
            if (B.mo31912b() != null) {
                for (C9132l next : y) {
                    C9190g j = ((C9176c) next).mo31934j();
                    if (j instanceof C9224v) {
                        if (((C9224v) j).mo32022A().equals(B.mo31912b())) {
                            arrayList.add(next);
                        }
                    } else if (j instanceof C9202b0) {
                        if (((C9202b0) j).mo31967A().equals(B.mo31912b())) {
                            arrayList.add(next);
                        }
                    } else if (j instanceof C9205d) {
                        if (((C9205d) j).mo31974x().equals(B.mo31912b())) {
                            arrayList.add(next);
                        }
                    } else if (j instanceof C9226x) {
                        if (((C9226x) j).mo32024x().equals(B.mo31912b())) {
                            arrayList.add(next);
                        }
                    } else if (j instanceof C9209g) {
                        for (C9159n a : ((C9209g) j).mo31981z().mo31820c()) {
                            if (a.mo31813a().equals(B.mo31912b())) {
                                arrayList.add(next);
                            }
                        }
                    } else if (j instanceof C9218p) {
                        for (C9159n a2 : ((C9218p) j).mo32005A().mo31820c()) {
                            if (a2.mo31813a().equals(B.mo31912b())) {
                                arrayList.add(next);
                            }
                        }
                    } else {
                        throw new RuntimeException("Need to implement getFields(FieldKey genericKey) for:" + j.getClass());
                    }
                }
                return arrayList;
            } else if (cVar == C9123c.TRACK) {
                for (C9132l next2 : y) {
                    C9190g j2 = ((C9176c) next2).mo31934j();
                    if ((j2 instanceof C9223u) && ((C9223u) j2).mo32019x() != null) {
                        arrayList.add(next2);
                    }
                }
                return arrayList;
            } else if (cVar == C9123c.TRACK_TOTAL) {
                for (C9132l next3 : y) {
                    C9190g j3 = ((C9176c) next3).mo31934j();
                    if ((j3 instanceof C9223u) && ((C9223u) j3).mo32021z() != null) {
                        arrayList.add(next3);
                    }
                }
                return arrayList;
            } else if (cVar == C9123c.DISC_NO) {
                for (C9132l next4 : y) {
                    C9190g j4 = ((C9176c) next4).mo31934j();
                    if ((j4 instanceof C9222t) && ((C9222t) j4).mo32013x() != null) {
                        arrayList.add(next4);
                    }
                }
                return arrayList;
            } else if (cVar != C9123c.DISC_TOTAL) {
                return y;
            } else {
                for (C9132l next5 : y) {
                    C9190g j5 = ((C9176c) next5).mo31934j();
                    if ((j5 instanceof C9222t) && ((C9222t) j5).mo32015z() != null) {
                        arrayList.add(next5);
                    }
                }
                return arrayList;
            }
        } else {
            throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
        }
    }

    /* renamed from: b */
    public int mo31518b() {
        int i = 0;
        while (true) {
            try {
                C9132l next = mo31520d().next();
                i++;
            } catch (NoSuchElementException unused) {
                return i;
            }
        }
    }

    /* renamed from: d */
    public Iterator<C9132l> mo31520d() {
        return new C9181a(this, this.f35837j.entrySet().iterator(), this.f35837j.entrySet().iterator());
    }

    /* renamed from: e */
    public void mo31521e(C9123c cVar, String str) throws C9128h, C9122b {
        mo31895O(mo31889u(cVar, str));
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C9180d) && this.f35837j.equals(((C9180d) obj).f35837j) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return this.f35837j.size() == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract void mo31888o(C9176c cVar);

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0201 A[SYNTHETIC, Splitter:B:84:0x0201] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31898p(java.io.File r30, int r31, long r32) throws java.io.FileNotFoundException, java.io.IOException {
        /*
            r29 = this;
            r1 = r30
            r0 = r31
            r2 = r32
            java.lang.String r4 = "Problem closing channels and locks:"
            java.util.logging.Logger r5 = p402l.p406b.p426c.p431t.C9172a.f35808i
            java.lang.String r6 = "Need to move audio file to accommodate tag"
            r5.finer(r6)
            byte[] r5 = new byte[r0]
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r6 = 2
            java.lang.String r9 = p402l.p406b.p407a.p416i.C9057i.m48299b(r30)     // Catch:{ IOException -> 0x027d }
            java.lang.String r10 = ".new"
            java.io.File r11 = r30.getParentFile()     // Catch:{ IOException -> 0x027d }
            java.io.File r9 = java.io.File.createTempFile(r9, r10, r11)     // Catch:{ IOException -> 0x027d }
            java.util.logging.Logger r10 = p402l.p406b.p426c.p431t.C9172a.f35808i     // Catch:{ IOException -> 0x027d }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x027d }
            r11.<init>()     // Catch:{ IOException -> 0x027d }
            java.lang.String r12 = "Created temp file:"
            r11.append(r12)     // Catch:{ IOException -> 0x027d }
            java.lang.String r12 = r9.getName()     // Catch:{ IOException -> 0x027d }
            r11.append(r12)     // Catch:{ IOException -> 0x027d }
            java.lang.String r12 = " for "
            r11.append(r12)     // Catch:{ IOException -> 0x027d }
            java.lang.String r12 = r30.getName()     // Catch:{ IOException -> 0x027d }
            r11.append(r12)     // Catch:{ IOException -> 0x027d }
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x027d }
            r10.finest(r11)     // Catch:{ IOException -> 0x027d }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0234 }
            r10.<init>(r9)     // Catch:{ FileNotFoundException -> 0x0234 }
            java.nio.channels.FileChannel r10 = r10.getChannel()     // Catch:{ FileNotFoundException -> 0x0234 }
            r11 = 0
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch:{ k -> 0x01f4, all -> 0x01ed }
            r12.<init>(r1)     // Catch:{ k -> 0x01f4, all -> 0x01ed }
            java.nio.channels.FileChannel r15 = r12.getChannel()     // Catch:{ k -> 0x01f4, all -> 0x01ed }
            int r5 = r10.write(r5)     // Catch:{ k -> 0x01e3, all -> 0x01d8 }
            long r13 = (long) r5     // Catch:{ k -> 0x01e3, all -> 0x01d8 }
            java.util.logging.Logger r5 = p402l.p406b.p426c.p431t.C9172a.f35808i     // Catch:{ k -> 0x01e3, all -> 0x01d8 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ k -> 0x01e3, all -> 0x01d8 }
            r11.<init>()     // Catch:{ k -> 0x01e3, all -> 0x01d8 }
            java.lang.String r12 = "Copying:"
            r11.append(r12)     // Catch:{ k -> 0x01e3, all -> 0x01d8 }
            long r16 = r30.length()     // Catch:{ k -> 0x01e3, all -> 0x01d8 }
            long r7 = r16 - r2
            r11.append(r7)     // Catch:{ k -> 0x01e3, all -> 0x01d8 }
            java.lang.String r7 = "bytes"
            r11.append(r7)     // Catch:{ k -> 0x01e3, all -> 0x01d8 }
            java.lang.String r7 = r11.toString()     // Catch:{ k -> 0x01e3, all -> 0x01d8 }
            r5.finer(r7)     // Catch:{ k -> 0x01e3, all -> 0x01d8 }
            long r7 = r30.length()     // Catch:{ k -> 0x01e3, all -> 0x01d8 }
            long r7 = r7 - r2
            java.lang.String r5 = " Data:"
            java.lang.String r12 = "Written padding:"
            r18 = 10000000(0x989680, double:4.9406565E-317)
            int r11 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r11 > 0) goto L_0x00f3
            r15.position(r2)     // Catch:{ k -> 0x00ea, all -> 0x00e3 }
            long r2 = (long) r0
            r11 = r10
            r0 = r12
            r12 = r15
            r17 = r9
            r20 = r10
            r9 = r13
            r13 = r2
            r21 = r15
            r15 = r7
            long r2 = r11.transferFrom(r12, r13, r15)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            java.util.logging.Logger r11 = p402l.p406b.p426c.p431t.C9172a.f35808i     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            r12.<init>()     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            r12.append(r0)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            r12.append(r9)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            r12.append(r5)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            r12.append(r2)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            java.lang.String r0 = r12.toString()     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            r11.finer(r0)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00c7
            goto L_0x0151
        L_0x00c7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            l.b.b.b r1 = p402l.p406b.p425b.C9118b.MP3_UNABLE_TO_ADJUST_PADDING     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            r7 = 0
            r5[r7] = r6     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            r3 = 1
            r5[r3] = r2     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            java.lang.String r1 = r1.getMsg(r5)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            r0.<init>(r1)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            throw r0     // Catch:{ k -> 0x01d2, all -> 0x01ce }
        L_0x00e3:
            r0 = move-exception
            r20 = r10
            r21 = r15
            goto L_0x01cf
        L_0x00ea:
            r0 = move-exception
            r20 = r10
            r21 = r15
            r5 = r29
            goto L_0x01ea
        L_0x00f3:
            r17 = r9
            r20 = r10
            r0 = r12
            r9 = r13
            r21 = r15
            long r22 = r7 / r18
            long r24 = r7 % r18
            r11 = 0
            r26 = r11
            r14 = 0
        L_0x0104:
            long r11 = (long) r14     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            int r13 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r13 >= 0) goto L_0x0120
            long r11 = r11 * r18
            long r12 = r2 + r11
            r15 = 10000000(0x989680, double:4.9406565E-317)
            r11 = r21
            r28 = r14
            r14 = r15
            r16 = r20
            long r11 = r11.transferTo(r12, r14, r16)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            long r26 = r26 + r11
            int r14 = r28 + 1
            goto L_0x0104
        L_0x0120:
            java.lang.Long.signum(r22)
            long r22 = r22 * r18
            long r12 = r2 + r22
            r11 = r21
            r14 = r24
            r16 = r20
            long r2 = r11.transferTo(r12, r14, r16)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            long r2 = r26 + r2
            java.util.logging.Logger r11 = p402l.p406b.p426c.p431t.C9172a.f35808i     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            r12.<init>()     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            r12.append(r0)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            r12.append(r9)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            r12.append(r5)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            r12.append(r2)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            java.lang.String r0 = r12.toString()     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            r11.finer(r0)     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x01aa
        L_0x0151:
            long r2 = r30.lastModified()     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            if (r21 == 0) goto L_0x0160
            boolean r0 = r21.isOpen()     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            if (r0 == 0) goto L_0x0160
            r21.close()     // Catch:{ k -> 0x01d2, all -> 0x01ce }
        L_0x0160:
            if (r20 == 0) goto L_0x016b
            boolean r0 = r20.isOpen()     // Catch:{ k -> 0x01d2, all -> 0x01ce }
            if (r0 == 0) goto L_0x016b
            r20.close()     // Catch:{ k -> 0x01d2, all -> 0x01ce }
        L_0x016b:
            r5 = r29
            r9 = r17
            r5.m48790M(r1, r9)     // Catch:{ k -> 0x01cc, all -> 0x01ca }
            r9.setLastModified(r2)     // Catch:{ k -> 0x01cc, all -> 0x01ca }
            if (r21 == 0) goto L_0x0183
            boolean r0 = r21.isOpen()     // Catch:{ Exception -> 0x0181 }
            if (r0 == 0) goto L_0x0183
            r21.close()     // Catch:{ Exception -> 0x0181 }
            goto L_0x0183
        L_0x0181:
            r0 = move-exception
            goto L_0x018f
        L_0x0183:
            if (r20 == 0) goto L_0x01a9
            boolean r0 = r20.isOpen()     // Catch:{ Exception -> 0x0181 }
            if (r0 == 0) goto L_0x01a9
            r20.close()     // Catch:{ Exception -> 0x0181 }
            goto L_0x01a9
        L_0x018f:
            java.util.logging.Logger r1 = p402l.p406b.p426c.p431t.C9172a.f35808i
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = r0.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.log(r2, r3, r0)
        L_0x01a9:
            return
        L_0x01aa:
            r5 = r29
            r9 = r17
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ k -> 0x01cc, all -> 0x01ca }
            l.b.b.b r1 = p402l.p406b.p425b.C9118b.MP3_UNABLE_TO_ADJUST_PADDING     // Catch:{ k -> 0x01cc, all -> 0x01ca }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ k -> 0x01cc, all -> 0x01ca }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ k -> 0x01cc, all -> 0x01ca }
            r8 = 0
            r6[r8] = r7     // Catch:{ k -> 0x01cc, all -> 0x01ca }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ k -> 0x01cc, all -> 0x01ca }
            r3 = 1
            r6[r3] = r2     // Catch:{ k -> 0x01cc, all -> 0x01ca }
            java.lang.String r1 = r1.getMsg(r6)     // Catch:{ k -> 0x01cc, all -> 0x01ca }
            r0.<init>(r1)     // Catch:{ k -> 0x01cc, all -> 0x01ca }
            throw r0     // Catch:{ k -> 0x01cc, all -> 0x01ca }
        L_0x01ca:
            r0 = move-exception
            goto L_0x01df
        L_0x01cc:
            r0 = move-exception
            goto L_0x01ea
        L_0x01ce:
            r0 = move-exception
        L_0x01cf:
            r5 = r29
            goto L_0x01df
        L_0x01d2:
            r0 = move-exception
            r5 = r29
            r9 = r17
            goto L_0x01ea
        L_0x01d8:
            r0 = move-exception
            r5 = r29
            r20 = r10
            r21 = r15
        L_0x01df:
            r1 = r0
            r11 = r21
            goto L_0x01ff
        L_0x01e3:
            r0 = move-exception
            r5 = r29
            r20 = r10
            r21 = r15
        L_0x01ea:
            r11 = r21
            goto L_0x01f9
        L_0x01ed:
            r0 = move-exception
            r5 = r29
            r20 = r10
        L_0x01f2:
            r1 = r0
            goto L_0x01ff
        L_0x01f4:
            r0 = move-exception
            r5 = r29
            r20 = r10
        L_0x01f9:
            r9.delete()     // Catch:{ all -> 0x01fd }
            throw r0     // Catch:{ all -> 0x01fd }
        L_0x01fd:
            r0 = move-exception
            goto L_0x01f2
        L_0x01ff:
            if (r11 == 0) goto L_0x020d
            boolean r0 = r11.isOpen()     // Catch:{ Exception -> 0x020b }
            if (r0 == 0) goto L_0x020d
            r11.close()     // Catch:{ Exception -> 0x020b }
            goto L_0x020d
        L_0x020b:
            r0 = move-exception
            goto L_0x0219
        L_0x020d:
            if (r20 == 0) goto L_0x0233
            boolean r0 = r20.isOpen()     // Catch:{ Exception -> 0x020b }
            if (r0 == 0) goto L_0x0233
            r20.close()     // Catch:{ Exception -> 0x020b }
            goto L_0x0233
        L_0x0219:
            java.util.logging.Logger r2 = p402l.p406b.p426c.p431t.C9172a.f35808i
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = r0.getMessage()
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r2.log(r3, r4, r0)
        L_0x0233:
            throw r1
        L_0x0234:
            r0 = move-exception
            r5 = r29
            java.util.logging.Logger r2 = p402l.p406b.p426c.p431t.C9172a.f35808i
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE
            java.lang.String r4 = r0.getMessage()
            r2.log(r3, r4, r0)
            java.util.logging.Logger r0 = p402l.p406b.p426c.p431t.C9172a.f35808i
            l.b.b.b r2 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_MODIFY_TEMPORARY_FILE_IN_FOLDER
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r4 = r30.getName()
            r7 = 0
            r3[r7] = r4
            java.io.File r4 = r30.getParentFile()
            java.lang.String r4 = r4.getPath()
            r8 = 1
            r3[r8] = r4
            java.lang.String r3 = r2.getMsg(r3)
            r0.severe(r3)
            l.b.a.g.j r0 = new l.b.a.g.j
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r4 = r30.getName()
            r3[r7] = r4
            java.io.File r1 = r30.getParentFile()
            java.lang.String r1 = r1.getPath()
            r3[r8] = r1
            java.lang.String r1 = r2.getMsg(r3)
            r0.<init>(r1)
            throw r0
        L_0x027d:
            r0 = move-exception
            r5 = r29
            java.util.logging.Logger r2 = p402l.p406b.p426c.p431t.C9172a.f35808i
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE
            java.lang.String r4 = r0.getMessage()
            r2.log(r3, r4, r0)
            java.lang.String r0 = r0.getMessage()
            l.b.b.c r2 = p402l.p406b.p425b.C9119c.ACCESS_IS_DENIED
            java.lang.String r2 = r2.getMsg()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x02d6
            java.util.logging.Logger r0 = p402l.p406b.p426c.p431t.C9172a.f35808i
            l.b.b.b r2 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_CREATE_TEMPORARY_FILE_IN_FOLDER
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r4 = r30.getName()
            r7 = 0
            r3[r7] = r4
            java.io.File r4 = r30.getParentFile()
            java.lang.String r4 = r4.getPath()
            r8 = 1
            r3[r8] = r4
            java.lang.String r3 = r2.getMsg(r3)
            r0.severe(r3)
            l.b.a.g.i r0 = new l.b.a.g.i
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r4 = r30.getName()
            r3[r7] = r4
            java.io.File r1 = r30.getParentFile()
            java.lang.String r1 = r1.getPath()
            r3[r8] = r1
            java.lang.String r1 = r2.getMsg(r3)
            r0.<init>(r1)
            throw r0
        L_0x02d6:
            r7 = 0
            r8 = 1
            java.util.logging.Logger r0 = p402l.p406b.p426c.p431t.C9172a.f35808i
            l.b.b.b r2 = p402l.p406b.p425b.C9118b.GENERAL_WRITE_FAILED_TO_CREATE_TEMPORARY_FILE_IN_FOLDER
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r4 = r30.getName()
            r3[r7] = r4
            java.io.File r4 = r30.getParentFile()
            java.lang.String r4 = r4.getPath()
            r3[r8] = r4
            java.lang.String r3 = r2.getMsg(r3)
            r0.severe(r3)
            l.b.a.g.i r0 = new l.b.a.g.i
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r4 = r30.getName()
            r3[r7] = r4
            java.io.File r1 = r30.getParentFile()
            java.lang.String r1 = r1.getPath()
            r3[r8] = r1
            java.lang.String r1 = r2.getMsg(r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p426c.p431t.C9180d.mo31898p(java.io.File, int, long):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public int mo31899q(int i, int i2) {
        return i <= i2 ? i2 : i + 100;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo31900r(String str, C9176c cVar) {
        if (this.f35837j.containsKey(cVar.mo31857g())) {
            Object obj = this.f35837j.get(cVar.mo31857g());
            if (obj instanceof C9176c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((C9176c) obj);
                arrayList.add(cVar);
                this.f35837j.put(cVar.mo31857g(), arrayList);
                return;
            }
            ((List) obj).add(cVar);
            return;
        }
        this.f35837j.put(cVar.mo31857g(), cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo31901s(C9180d dVar) {
        this.f35837j = new LinkedHashMap();
        this.f35838k = new LinkedHashMap();
        for (String str : dVar.f35837j.keySet()) {
            Object obj = dVar.f35837j.get(str);
            if (obj instanceof C9176c) {
                mo31888o((C9176c) obj);
            } else if (obj instanceof C9197j0) {
                for (C9176c o : ((C9197j0) obj).mo31957b()) {
                    mo31888o(o);
                }
            } else if (obj instanceof ArrayList) {
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    mo31888o((C9176c) it.next());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo31902t(C9180d dVar) {
        C9172a.f35808i.config("Copying Primitives");
        this.f35839l = dVar.f35839l;
        this.f35840m = dVar.f35840m;
        this.f35841n = dVar.f35841n;
        this.f35842o = dVar.f35842o;
        this.f35843p = dVar.f35843p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tag content:\n");
        Iterator<C9132l> d = mo31520d();
        while (d.hasNext()) {
            C9132l next = d.next();
            sb.append("\t");
            sb.append(next.mo31497D());
            sb.append(":");
            sb.append(next.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: u */
    public C9132l mo31889u(C9123c cVar, String str) throws C9128h, C9122b {
        if (cVar != null) {
            C9182b B = mo31877B(cVar);
            if (cVar == C9123c.TRACK) {
                C9176c v = mo31890v(B.mo31911a());
                ((C9223u) v.mo31934j()).mo32017B(str);
                return v;
            } else if (cVar == C9123c.TRACK_TOTAL) {
                C9176c v2 = mo31890v(B.mo31911a());
                ((C9223u) v2.mo31934j()).mo32018C(str);
                return v2;
            } else if (cVar == C9123c.DISC_NO) {
                C9176c v3 = mo31890v(B.mo31911a());
                ((C9222t) v3.mo31934j()).mo32011B(str);
                return v3;
            } else if (cVar != C9123c.DISC_TOTAL) {
                return mo31904x(B, str);
            } else {
                C9176c v4 = mo31890v(B.mo31911a());
                ((C9222t) v4.mo31934j()).mo32012C(str);
                return v4;
            }
        } else {
            throw new C9128h();
        }
    }

    /* renamed from: v */
    public abstract C9176c mo31890v(String str);

    /* renamed from: w */
    public void mo31903w(RandomAccessFile randomAccessFile) throws IOException {
        byte[] bArr = new byte[3];
        FileChannel channel = randomAccessFile.getChannel();
        channel.position();
        ByteBuffer allocate = ByteBuffer.allocate(10);
        channel.read(allocate, 0);
        allocate.flip();
        if (mo31894N(allocate)) {
            randomAccessFile.seek(0);
            randomAccessFile.write(bArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public C9132l mo31904x(C9182b bVar, String str) throws C9128h, C9122b {
        C9176c v = mo31890v(bVar.mo31911a());
        if (v.mo31934j() instanceof C9226x) {
            ((C9226x) v.mo31934j()).mo32025y(bVar.mo31912b());
            try {
                ((C9226x) v.mo31934j()).mo32026z(str.getBytes("ISO-8859-1"));
            } catch (UnsupportedEncodingException unused) {
                throw new RuntimeException("When encoding UFID charset ISO-8859-1 was deemed unsupported");
            }
        } else if (v.mo31934j() instanceof C9224v) {
            ((C9224v) v.mo31934j()).mo32023B(bVar.mo31912b());
            ((C9224v) v.mo31934j()).mo31964z(str);
        } else if (v.mo31934j() instanceof C9202b0) {
            ((C9202b0) v.mo31934j()).mo31968B(bVar.mo31912b());
            ((C9202b0) v.mo31934j()).mo31966z(str);
        } else if (v.mo31934j() instanceof C9205d) {
            if (bVar.mo31912b() != null) {
                ((C9205d) v.mo31934j()).mo31971A(bVar.mo31912b());
                if (((C9205d) v.mo31934j()).mo31976z()) {
                    ((C9205d) v.mo31934j()).mo31972B("XXX");
                }
            }
            ((C9205d) v.mo31934j()).mo31973C(str);
        } else if (v.mo31934j() instanceof C9227y) {
            ((C9227y) v.mo31934j()).mo32028B(BuildConfig.FLAVOR);
            ((C9227y) v.mo31934j()).mo32029C(str);
        } else if (v.mo31934j() instanceof C9200a0) {
            ((C9200a0) v.mo31934j()).mo31966z(str);
        } else if (v.mo31934j() instanceof C9199a) {
            ((C9199a) v.mo31934j()).mo31964z(str);
        } else if (v.mo31934j() instanceof C9210h) {
            ((C9210h) v.mo31934j()).mo31982A(str);
        } else if (v.mo31934j() instanceof C9209g) {
            C9160o.C9161a aVar = new C9160o.C9161a();
            aVar.mo31819b(bVar.mo31912b(), str);
            v.mo31934j().mo31946r("Text", aVar);
        } else if (v.mo31934j() instanceof C9218p) {
            C9160o.C9161a aVar2 = new C9160o.C9161a();
            aVar2.mo31819b(bVar.mo31912b(), str);
            v.mo31934j().mo31946r("Text", aVar2);
        } else {
            v.mo31934j();
            v.mo31934j();
            throw new C9122b("Field with key of:" + bVar.mo31911a() + ":does not accept cannot parse data:" + str);
        }
        return v;
    }

    /* renamed from: y */
    public List<C9132l> mo31905y(String str) throws C9128h {
        Object A = mo31891A(str);
        if (A == null) {
            return new ArrayList();
        }
        if (A instanceof List) {
            return (List) A;
        }
        if (A instanceof C9176c) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((C9132l) A);
            return arrayList;
        }
        throw new RuntimeException("Found entry in frameMap that was not a frame or a list:" + A);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public FileLock mo31906z(FileChannel fileChannel, String str) throws IOException {
        Logger logger = C9172a.f35808i;
        logger.finest("locking fileChannel for " + str);
        try {
            FileLock tryLock = fileChannel.tryLock();
            if (tryLock != null) {
                return tryLock;
            }
            throw new IOException(C9118b.GENERAL_WRITE_FAILED_FILE_LOCKED.getMsg(str));
        } catch (IOException unused) {
            return null;
        }
    }
}
