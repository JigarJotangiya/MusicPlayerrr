package p402l.p406b.p407a.p409f.p411d;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: l.b.a.f.d.k */
/* compiled from: CountingInputStream */
class C8998k extends FilterInputStream {

    /* renamed from: g */
    private long f35455g = 0;

    /* renamed from: h */
    private long f35456h = 0;

    public C8998k(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: c */
    private synchronized void m48134c(long j) {
        if (j >= 0) {
            this.f35456h += j;
        }
    }

    /* renamed from: d */
    public synchronized long mo31464d() {
        return this.f35456h;
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f35455g = this.f35456h;
    }

    public int read() throws IOException {
        int read = super.read();
        m48134c(1);
        return read;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void reset() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            super.reset()     // Catch:{ all -> 0x000f }
            monitor-enter(r2)     // Catch:{ all -> 0x000f }
            long r0 = r2.f35455g     // Catch:{ all -> 0x000c }
            r2.f35456h = r0     // Catch:{ all -> 0x000c }
            monitor-exit(r2)     // Catch:{ all -> 0x000c }
            monitor-exit(r2)
            return
        L_0x000c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x000c }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p407a.p409f.p411d.C8998k.reset():void");
    }

    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        m48134c(skip);
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        m48134c((long) read);
        return read;
    }
}
