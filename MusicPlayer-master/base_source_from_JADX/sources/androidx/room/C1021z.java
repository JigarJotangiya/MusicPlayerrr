package androidx.room;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.p006d1.C0943e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p082e.p091b.p092a.p095c.C3458a;
import p082e.p149u.p150a.C4214b;
import p082e.p149u.p150a.C4215c;
import p082e.p149u.p150a.C4221e;
import p082e.p149u.p150a.C4222f;

/* renamed from: androidx.room.z */
/* compiled from: AutoClosingRoomOpenHelper */
final class C1021z implements C4215c, C0951e0 {

    /* renamed from: g */
    private final C4215c f4325g;

    /* renamed from: h */
    private final C1022a f4326h;

    /* renamed from: i */
    private final C1017y f4327i;

    /* renamed from: androidx.room.z$a */
    /* compiled from: AutoClosingRoomOpenHelper */
    static final class C1022a implements C4214b {

        /* renamed from: g */
        private final C1017y f4328g;

        C1022a(C1017y yVar) {
            this.f4328g = yVar;
        }

        /* renamed from: p */
        static /* synthetic */ Boolean m5936p(C4214b bVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                return Boolean.valueOf(bVar.mo5547x0());
            }
            return Boolean.FALSE;
        }

        /* renamed from: x */
        static /* synthetic */ Object m5937x(C4214b bVar) {
            return null;
        }

        /* renamed from: D */
        public Cursor mo5524D(C4221e eVar, CancellationSignal cancellationSignal) {
            try {
                return new C1024c(this.f4328g.mo5636e().mo5524D(eVar, cancellationSignal), this.f4328g);
            } catch (Throwable th) {
                this.f4328g.mo5633b();
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo5643E() {
            this.f4328g.mo5634c(C0950e.f4136a);
        }

        /* renamed from: M */
        public void mo5527M() {
            C4214b d = this.f4328g.mo5635d();
            if (d != null) {
                d.mo5527M();
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
        }

        /* renamed from: N */
        public void mo5528N(String str, Object[] objArr) throws SQLException {
            this.f4328g.mo5634c(new C0926b(str, objArr));
        }

        /* renamed from: P */
        public void mo5529P() {
            try {
                this.f4328g.mo5636e().mo5529P();
            } catch (Throwable th) {
                this.f4328g.mo5633b();
                throw th;
            }
        }

        /* renamed from: X */
        public Cursor mo5531X(String str) {
            try {
                return new C1024c(this.f4328g.mo5636e().mo5531X(str), this.f4328g);
            } catch (Throwable th) {
                this.f4328g.mo5633b();
                throw th;
            }
        }

        /* renamed from: a0 */
        public void mo5533a0() {
            if (this.f4328g.mo5635d() != null) {
                try {
                    this.f4328g.mo5635d().mo5533a0();
                } finally {
                    this.f4328g.mo5633b();
                }
            } else {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
        }

        public void close() throws IOException {
            this.f4328g.mo5632a();
        }

        public String getPath() {
            return (String) this.f4328g.mo5634c(C0922a.f4075a);
        }

        public boolean isOpen() {
            C4214b d = this.f4328g.mo5635d();
            if (d == null) {
                return false;
            }
            return d.isOpen();
        }

        /* renamed from: j0 */
        public Cursor mo5538j0(C4221e eVar) {
            try {
                return new C1024c(this.f4328g.mo5636e().mo5538j0(eVar), this.f4328g);
            } catch (Throwable th) {
                this.f4328g.mo5633b();
                throw th;
            }
        }

        /* renamed from: m */
        public void mo5539m() {
            try {
                this.f4328g.mo5636e().mo5539m();
            } catch (Throwable th) {
                this.f4328g.mo5633b();
                throw th;
            }
        }

        /* renamed from: n */
        public List<Pair<String, String>> mo5541n() {
            return (List) this.f4328g.mo5634c(C1007v.f4274a);
        }

        /* renamed from: q */
        public void mo5543q(String str) throws SQLException {
            this.f4328g.mo5634c(new C0934c(str));
        }

        /* renamed from: r0 */
        public boolean mo5544r0() {
            if (this.f4328g.mo5635d() == null) {
                return false;
            }
            return ((Boolean) this.f4328g.mo5634c(C0954g.f4139a)).booleanValue();
        }

        /* renamed from: v */
        public C4222f mo5545v(String str) {
            return new C1023b(str, this.f4328g);
        }

        @SuppressLint({"UnsafeNewApiCall"})
        /* renamed from: x0 */
        public boolean mo5547x0() {
            return ((Boolean) this.f4328g.mo5634c(C0937d.f4091a)).booleanValue();
        }
    }

    /* renamed from: androidx.room.z$b */
    /* compiled from: AutoClosingRoomOpenHelper */
    private static class C1023b implements C4222f {

        /* renamed from: g */
        private final String f4329g;

        /* renamed from: h */
        private final ArrayList<Object> f4330h = new ArrayList<>();

        /* renamed from: i */
        private final C1017y f4331i;

        C1023b(String str, C1017y yVar) {
            this.f4329g = str;
            this.f4331i = yVar;
        }

        /* renamed from: E */
        private void m5952E(int i, Object obj) {
            int i2 = i - 1;
            if (i2 >= this.f4330h.size()) {
                for (int size = this.f4330h.size(); size <= i2; size++) {
                    this.f4330h.add((Object) null);
                }
            }
            this.f4330h.set(i2, obj);
        }

        /* renamed from: c */
        private void m5953c(C4222f fVar) {
            int i = 0;
            while (i < this.f4330h.size()) {
                int i2 = i + 1;
                Object obj = this.f4330h.get(i);
                if (obj == null) {
                    fVar.mo5561k0(i2);
                } else if (obj instanceof Long) {
                    fVar.mo5557L(i2, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    fVar.mo5563y(i2, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    fVar.mo5562r(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    fVar.mo5558S(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        /* renamed from: d */
        private <T> T m5954d(C3458a<C4222f, T> aVar) {
            return this.f4331i.mo5634c(new C0952f(this, aVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ Object mo5646x(C3458a aVar, C4214b bVar) {
            C4222f v = bVar.mo5545v(this.f4329g);
            m5953c(v);
            return aVar.apply(v);
        }

        /* renamed from: I0 */
        public long mo5565I0() {
            return ((Long) m5954d(C1003u.f4266a)).longValue();
        }

        /* renamed from: L */
        public void mo5557L(int i, long j) {
            m5952E(i, Long.valueOf(j));
        }

        /* renamed from: S */
        public void mo5558S(int i, byte[] bArr) {
            m5952E(i, bArr);
        }

        public void close() throws IOException {
        }

        /* renamed from: k0 */
        public void mo5561k0(int i) {
            m5952E(i, (Object) null);
        }

        /* renamed from: r */
        public void mo5562r(int i, String str) {
            m5952E(i, str);
        }

        /* renamed from: u */
        public int mo5568u() {
            return ((Integer) m5954d(C1014x.f4298a)).intValue();
        }

        /* renamed from: y */
        public void mo5563y(int i, double d) {
            m5952E(i, Double.valueOf(d));
        }
    }

    /* renamed from: androidx.room.z$c */
    /* compiled from: AutoClosingRoomOpenHelper */
    private static final class C1024c implements Cursor {

        /* renamed from: g */
        private final Cursor f4332g;

        /* renamed from: h */
        private final C1017y f4333h;

        C1024c(Cursor cursor, C1017y yVar) {
            this.f4332g = cursor;
            this.f4333h = yVar;
        }

        public void close() {
            this.f4332g.close();
            this.f4333h.mo5633b();
        }

        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.f4332g.copyStringToBuffer(i, charArrayBuffer);
        }

        @Deprecated
        public void deactivate() {
            this.f4332g.deactivate();
        }

        public byte[] getBlob(int i) {
            return this.f4332g.getBlob(i);
        }

        public int getColumnCount() {
            return this.f4332g.getColumnCount();
        }

        public int getColumnIndex(String str) {
            return this.f4332g.getColumnIndex(str);
        }

        public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
            return this.f4332g.getColumnIndexOrThrow(str);
        }

        public String getColumnName(int i) {
            return this.f4332g.getColumnName(i);
        }

        public String[] getColumnNames() {
            return this.f4332g.getColumnNames();
        }

        public int getCount() {
            return this.f4332g.getCount();
        }

        public double getDouble(int i) {
            return this.f4332g.getDouble(i);
        }

        public Bundle getExtras() {
            return this.f4332g.getExtras();
        }

        public float getFloat(int i) {
            return this.f4332g.getFloat(i);
        }

        public int getInt(int i) {
            return this.f4332g.getInt(i);
        }

        public long getLong(int i) {
            return this.f4332g.getLong(i);
        }

        @SuppressLint({"UnsafeNewApiCall"})
        public Uri getNotificationUri() {
            return this.f4332g.getNotificationUri();
        }

        @SuppressLint({"UnsafeNewApiCall"})
        public List<Uri> getNotificationUris() {
            return this.f4332g.getNotificationUris();
        }

        public int getPosition() {
            return this.f4332g.getPosition();
        }

        public short getShort(int i) {
            return this.f4332g.getShort(i);
        }

        public String getString(int i) {
            return this.f4332g.getString(i);
        }

        public int getType(int i) {
            return this.f4332g.getType(i);
        }

        public boolean getWantsAllOnMoveCalls() {
            return this.f4332g.getWantsAllOnMoveCalls();
        }

        public boolean isAfterLast() {
            return this.f4332g.isAfterLast();
        }

        public boolean isBeforeFirst() {
            return this.f4332g.isBeforeFirst();
        }

        public boolean isClosed() {
            return this.f4332g.isClosed();
        }

        public boolean isFirst() {
            return this.f4332g.isFirst();
        }

        public boolean isLast() {
            return this.f4332g.isLast();
        }

        public boolean isNull(int i) {
            return this.f4332g.isNull(i);
        }

        public boolean move(int i) {
            return this.f4332g.move(i);
        }

        public boolean moveToFirst() {
            return this.f4332g.moveToFirst();
        }

        public boolean moveToLast() {
            return this.f4332g.moveToLast();
        }

        public boolean moveToNext() {
            return this.f4332g.moveToNext();
        }

        public boolean moveToPosition(int i) {
            return this.f4332g.moveToPosition(i);
        }

        public boolean moveToPrevious() {
            return this.f4332g.moveToPrevious();
        }

        public void registerContentObserver(ContentObserver contentObserver) {
            this.f4332g.registerContentObserver(contentObserver);
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f4332g.registerDataSetObserver(dataSetObserver);
        }

        @Deprecated
        public boolean requery() {
            return this.f4332g.requery();
        }

        public Bundle respond(Bundle bundle) {
            return this.f4332g.respond(bundle);
        }

        @SuppressLint({"UnsafeNewApiCall"})
        public void setExtras(Bundle bundle) {
            this.f4332g.setExtras(bundle);
        }

        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f4332g.setNotificationUri(contentResolver, uri);
        }

        @SuppressLint({"UnsafeNewApiCall"})
        public void setNotificationUris(ContentResolver contentResolver, List<Uri> list) {
            this.f4332g.setNotificationUris(contentResolver, list);
        }

        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f4332g.unregisterContentObserver(contentObserver);
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f4332g.unregisterDataSetObserver(dataSetObserver);
        }
    }

    C1021z(C4215c cVar, C1017y yVar) {
        this.f4325g = cVar;
        this.f4327i = yVar;
        yVar.mo5637f(cVar);
        this.f4326h = new C1022a(yVar);
    }

    /* renamed from: R */
    public C4214b mo5550R() {
        this.f4326h.mo5643E();
        return this.f4326h;
    }

    /* renamed from: V */
    public C4214b mo5551V() {
        this.f4326h.mo5643E();
        return this.f4326h;
    }

    /* renamed from: c */
    public C4215c mo5474c() {
        return this.f4325g;
    }

    public void close() {
        try {
            this.f4326h.close();
        } catch (IOException e) {
            C0943e.m5707a(e);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C1017y mo5642d() {
        return this.f4327i;
    }

    public String getDatabaseName() {
        return this.f4325g.getDatabaseName();
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f4325g.setWriteAheadLoggingEnabled(z);
    }
}
