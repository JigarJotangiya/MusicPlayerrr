package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.room.C0994s0;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p082e.p149u.p150a.C4215c;

/* renamed from: androidx.room.d0 */
/* compiled from: DatabaseConfiguration */
public class C0938d0 {

    /* renamed from: a */
    public final C4215c.C4219c f4092a;

    /* renamed from: b */
    public final Context f4093b;

    /* renamed from: c */
    public final String f4094c;

    /* renamed from: d */
    public final C0994s0.C0998d f4095d;

    /* renamed from: e */
    public final List<C0994s0.C0996b> f4096e;

    /* renamed from: f */
    public final C0994s0.C0999e f4097f;

    /* renamed from: g */
    public final List<Object> f4098g;

    /* renamed from: h */
    public final boolean f4099h;

    /* renamed from: i */
    public final C0994s0.C0997c f4100i;

    /* renamed from: j */
    public final Executor f4101j;

    /* renamed from: k */
    public final Executor f4102k;

    /* renamed from: l */
    public final boolean f4103l;

    /* renamed from: m */
    public final boolean f4104m;

    /* renamed from: n */
    public final boolean f4105n;

    /* renamed from: o */
    private final Set<Integer> f4106o;

    /* renamed from: p */
    public final Callable<InputStream> f4107p;

    @SuppressLint({"LambdaLast"})
    public C0938d0(Context context, String str, C4215c.C4219c cVar, C0994s0.C0998d dVar, List<C0994s0.C0996b> list, boolean z, C0994s0.C0997c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file, Callable<InputStream> callable, C0994s0.C0999e eVar, List<Object> list2) {
        this.f4092a = cVar;
        this.f4093b = context;
        this.f4094c = str;
        this.f4095d = dVar;
        this.f4096e = list;
        this.f4099h = z;
        this.f4100i = cVar2;
        this.f4101j = executor;
        this.f4102k = executor2;
        this.f4103l = z2;
        this.f4104m = z3;
        this.f4105n = z4;
        this.f4106o = set;
        this.f4107p = callable;
        this.f4098g = list2 == null ? Collections.emptyList() : list2;
    }

    /* renamed from: a */
    public boolean mo5456a(int i, int i2) {
        Set<Integer> set;
        if ((!(i > i2) || !this.f4105n) && this.f4104m && ((set = this.f4106o) == null || !set.contains(Integer.valueOf(i)))) {
            return true;
        }
        return false;
    }
}
