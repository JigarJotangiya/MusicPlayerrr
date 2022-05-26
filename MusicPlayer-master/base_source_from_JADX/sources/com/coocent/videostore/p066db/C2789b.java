package com.coocent.videostore.p066db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C0927b0;
import androidx.room.C0953f0;
import androidx.room.C0955g0;
import androidx.room.C0994s0;
import androidx.room.C1008v0;
import androidx.room.C1025z0;
import androidx.room.p006d1.C0940b;
import androidx.room.p006d1.C0941c;
import com.coocent.videostore.p067po.PrivateVideo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p082e.p149u.p150a.C4222f;
import p369i.p379w.C8508d;

/* renamed from: com.coocent.videostore.db.b */
/* compiled from: PrivateVideoDao_Impl */
public final class C2789b implements C2788a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0994s0 f9519a;

    /* renamed from: b */
    private final C1025z0 f9520b;

    /* renamed from: com.coocent.videostore.db.b$a */
    /* compiled from: PrivateVideoDao_Impl */
    class C2790a implements Callable<List<? extends PrivateVideo>> {

        /* renamed from: a */
        final /* synthetic */ C1008v0 f9521a;

        C2790a(C1008v0 v0Var) {
            this.f9521a = v0Var;
        }

        /* renamed from: a */
        public List<? extends PrivateVideo> call() throws Exception {
            C2790a aVar;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            int i;
            String str8;
            String str9;
            int i2;
            boolean z;
            String str10;
            int i3;
            String str11;
            String str12;
            Integer num;
            Boolean bool;
            Cursor c = C0941c.m5704c(C2789b.this.f9519a, this.f9521a, false, (CancellationSignal) null);
            try {
                int e = C0940b.m5701e(c, "video_id");
                int e2 = C0940b.m5701e(c, "uri");
                int e3 = C0940b.m5701e(c, "path");
                int e4 = C0940b.m5701e(c, "display_name");
                int e5 = C0940b.m5701e(c, "title");
                int e6 = C0940b.m5701e(c, "extension");
                int e7 = C0940b.m5701e(c, "size");
                int e8 = C0940b.m5701e(c, "duration");
                int e9 = C0940b.m5701e(c, "width");
                int e10 = C0940b.m5701e(c, "height");
                int e11 = C0940b.m5701e(c, "mime_type");
                int e12 = C0940b.m5701e(c, "date_taken");
                int e13 = C0940b.m5701e(c, "date_modified");
                int e14 = C0940b.m5701e(c, "folder_name");
                try {
                    int e15 = C0940b.m5701e(c, "folder_path");
                    int e16 = C0940b.m5701e(c, "thumbnail");
                    int e17 = C0940b.m5701e(c, "recent_added");
                    int e18 = C0940b.m5701e(c, "last_watch_time");
                    int e19 = C0940b.m5701e(c, "video_count");
                    int e20 = C0940b.m5701e(c, "video_recent_added_count");
                    int e21 = C0940b.m5701e(c, "last_playback_time");
                    int e22 = C0940b.m5701e(c, "last_copy_folder_uri");
                    int e23 = C0940b.m5701e(c, "last_copy_folder_path");
                    int e24 = C0940b.m5701e(c, "last_display_name");
                    int e25 = C0940b.m5701e(c, "is_private_video");
                    int i4 = e14;
                    ArrayList arrayList = new ArrayList(c.getCount());
                    while (c.moveToNext()) {
                        PrivateVideo privateVideo = new PrivateVideo();
                        int i5 = e11;
                        int i6 = e12;
                        privateVideo.mo10467N(c.getLong(e));
                        if (c.isNull(e2)) {
                            str = null;
                        } else {
                            str = c.getString(e2);
                        }
                        privateVideo.mo10482b0(str);
                        if (c.isNull(e3)) {
                            str2 = null;
                        } else {
                            str2 = c.getString(e3);
                        }
                        privateVideo.mo10475W(str2);
                        if (c.isNull(e4)) {
                            str3 = null;
                        } else {
                            str3 = c.getString(e4);
                        }
                        privateVideo.mo10461F(str3);
                        if (c.isNull(e5)) {
                            str4 = null;
                        } else {
                            str4 = c.getString(e5);
                        }
                        privateVideo.mo10480a0(str4);
                        if (c.isNull(e6)) {
                            str5 = null;
                        } else {
                            str5 = c.getString(e6);
                        }
                        privateVideo.mo10463I(str5);
                        privateVideo.mo10477Y(c.getLong(e7));
                        privateVideo.mo10462G(c.getLong(e8));
                        privateVideo.mo10483c0(c.getInt(e9));
                        privateVideo.mo10466M(c.getInt(e10));
                        e11 = i5;
                        if (c.isNull(e11)) {
                            str6 = null;
                        } else {
                            str6 = c.getString(e11);
                        }
                        privateVideo.mo10474V(str6);
                        int i7 = e2;
                        e12 = i6;
                        int i8 = e3;
                        privateVideo.mo10460D(c.getLong(e12));
                        privateVideo.mo10459C(c.getLong(e13));
                        int i9 = i4;
                        if (c.isNull(i9)) {
                            str7 = null;
                        } else {
                            str7 = c.getString(i9);
                        }
                        privateVideo.mo10464J(str7);
                        int i10 = e15;
                        if (c.isNull(i10)) {
                            i = e;
                            str8 = null;
                        } else {
                            i = e;
                            str8 = c.getString(i10);
                        }
                        privateVideo.mo10465L(str8);
                        int i11 = e16;
                        if (c.isNull(i11)) {
                            e16 = i11;
                            str9 = null;
                        } else {
                            e16 = i11;
                            str9 = c.getString(i11);
                        }
                        privateVideo.mo10478Z(str9);
                        int i12 = e17;
                        boolean z2 = true;
                        if (c.getInt(i12) != 0) {
                            i2 = i12;
                            z = true;
                        } else {
                            i2 = i12;
                            z = false;
                        }
                        privateVideo.mo10476X(z);
                        int i13 = i10;
                        int i14 = e18;
                        int i15 = i9;
                        privateVideo.mo10473U(c.getLong(i14));
                        int i16 = e19;
                        privateVideo.mo10458B(c.getInt(i16));
                        int i17 = i14;
                        int i18 = e20;
                        privateVideo.mo10457A(c.getInt(i18));
                        int i19 = i16;
                        int i20 = e21;
                        int i21 = i18;
                        privateVideo.mo10472S(c.getLong(i20));
                        int i22 = e22;
                        if (c.isNull(i22)) {
                            str10 = null;
                        } else {
                            str10 = c.getString(i22);
                        }
                        privateVideo.mo10470Q(str10);
                        int i23 = e23;
                        if (c.isNull(i23)) {
                            i3 = i20;
                            str11 = null;
                        } else {
                            i3 = i20;
                            str11 = c.getString(i23);
                        }
                        privateVideo.mo10469P(str11);
                        int i24 = e24;
                        if (c.isNull(i24)) {
                            e24 = i24;
                            str12 = null;
                        } else {
                            e24 = i24;
                            str12 = c.getString(i24);
                        }
                        privateVideo.mo10471R(str12);
                        int i25 = e25;
                        if (c.isNull(i25)) {
                            num = null;
                        } else {
                            num = Integer.valueOf(c.getInt(i25));
                        }
                        if (num == null) {
                            e25 = i25;
                            bool = null;
                        } else {
                            if (num.intValue() == 0) {
                                z2 = false;
                            }
                            e25 = i25;
                            bool = Boolean.valueOf(z2);
                        }
                        privateVideo.mo10468O(bool);
                        arrayList.add(privateVideo);
                        e22 = i22;
                        e17 = i2;
                        e = i;
                        e2 = i7;
                        e15 = i13;
                        i4 = i15;
                        e18 = i17;
                        e19 = i19;
                        e20 = i21;
                        e21 = i3;
                        e23 = i23;
                        e3 = i8;
                    }
                    c.close();
                    this.f9521a.mo5622H();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    aVar = this;
                    c.close();
                    aVar.f9521a.mo5622H();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                aVar = this;
                c.close();
                aVar.f9521a.mo5622H();
                throw th;
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.b$b */
    /* compiled from: PrivateVideoDao_Impl */
    class C2791b extends C0955g0<PrivateVideo> {
        C2791b(C2789b bVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "INSERT OR ABORT INTO `private` (`video_id`,`uri`,`path`,`display_name`,`title`,`extension`,`size`,`duration`,`width`,`height`,`mime_type`,`date_taken`,`date_modified`,`folder_name`,`folder_path`,`thumbnail`,`recent_added`,`last_watch_time`,`video_count`,`video_recent_added_count`,`last_playback_time`,`last_copy_folder_uri`,`last_copy_folder_path`,`last_display_name`,`is_private_video`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: i */
        public void mo5478g(C4222f fVar, PrivateVideo privateVideo) {
            fVar.mo5557L(1, privateVideo.mo10495l());
            if (privateVideo.mo10508x() == null) {
                fVar.mo5561k0(2);
            } else {
                fVar.mo5562r(2, privateVideo.mo10508x());
            }
            if (privateVideo.mo10503t() == null) {
                fVar.mo5561k0(3);
            } else {
                fVar.mo5562r(3, privateVideo.mo10503t());
            }
            if (privateVideo.mo10488f() == null) {
                fVar.mo5561k0(4);
            } else {
                fVar.mo5562r(4, privateVideo.mo10488f());
            }
            if (privateVideo.mo10506w() == null) {
                fVar.mo5561k0(5);
            } else {
                fVar.mo5562r(5, privateVideo.mo10506w());
            }
            if (privateVideo.mo10490h() == null) {
                fVar.mo5561k0(6);
            } else {
                fVar.mo5562r(6, privateVideo.mo10490h());
            }
            fVar.mo5557L(7, privateVideo.mo10504u());
            fVar.mo5557L(8, privateVideo.mo10489g());
            fVar.mo5557L(9, (long) privateVideo.mo10509y());
            fVar.mo5557L(10, (long) privateVideo.mo10494k());
            if (privateVideo.mo10502s() == null) {
                fVar.mo5561k0(11);
            } else {
                fVar.mo5562r(11, privateVideo.mo10502s());
            }
            fVar.mo5557L(12, privateVideo.mo10486e());
            fVar.mo5557L(13, privateVideo.mo10484d());
            if (privateVideo.mo10492i() == null) {
                fVar.mo5561k0(14);
            } else {
                fVar.mo5562r(14, privateVideo.mo10492i());
            }
            if (privateVideo.mo10493j() == null) {
                fVar.mo5561k0(15);
            } else {
                fVar.mo5562r(15, privateVideo.mo10493j());
            }
            if (privateVideo.mo10505v() == null) {
                fVar.mo5561k0(16);
            } else {
                fVar.mo5562r(16, privateVideo.mo10505v());
            }
            fVar.mo5557L(17, privateVideo.mo10510z() ? 1 : 0);
            fVar.mo5557L(18, privateVideo.mo10501r());
            fVar.mo5557L(19, (long) privateVideo.mo10481b());
            fVar.mo5557L(20, (long) privateVideo.mo10479a());
            fVar.mo5557L(21, privateVideo.mo10500q());
            if (privateVideo.mo10498o() == null) {
                fVar.mo5561k0(22);
            } else {
                fVar.mo5562r(22, privateVideo.mo10498o());
            }
            if (privateVideo.mo10497n() == null) {
                fVar.mo5561k0(23);
            } else {
                fVar.mo5562r(23, privateVideo.mo10497n());
            }
            if (privateVideo.mo10499p() == null) {
                fVar.mo5561k0(24);
            } else {
                fVar.mo5562r(24, privateVideo.mo10499p());
            }
            Integer valueOf = privateVideo.mo10496m() == null ? null : Integer.valueOf(privateVideo.mo10496m().booleanValue() ? 1 : 0);
            if (valueOf == null) {
                fVar.mo5561k0(25);
            } else {
                fVar.mo5557L(25, (long) valueOf.intValue());
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.b$c */
    /* compiled from: PrivateVideoDao_Impl */
    class C2792c extends C0955g0<PrivateVideo> {
        C2792c(C2789b bVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "INSERT OR REPLACE INTO `private` (`video_id`,`uri`,`path`,`display_name`,`title`,`extension`,`size`,`duration`,`width`,`height`,`mime_type`,`date_taken`,`date_modified`,`folder_name`,`folder_path`,`thumbnail`,`recent_added`,`last_watch_time`,`video_count`,`video_recent_added_count`,`last_playback_time`,`last_copy_folder_uri`,`last_copy_folder_path`,`last_display_name`,`is_private_video`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: i */
        public void mo5478g(C4222f fVar, PrivateVideo privateVideo) {
            fVar.mo5557L(1, privateVideo.mo10495l());
            if (privateVideo.mo10508x() == null) {
                fVar.mo5561k0(2);
            } else {
                fVar.mo5562r(2, privateVideo.mo10508x());
            }
            if (privateVideo.mo10503t() == null) {
                fVar.mo5561k0(3);
            } else {
                fVar.mo5562r(3, privateVideo.mo10503t());
            }
            if (privateVideo.mo10488f() == null) {
                fVar.mo5561k0(4);
            } else {
                fVar.mo5562r(4, privateVideo.mo10488f());
            }
            if (privateVideo.mo10506w() == null) {
                fVar.mo5561k0(5);
            } else {
                fVar.mo5562r(5, privateVideo.mo10506w());
            }
            if (privateVideo.mo10490h() == null) {
                fVar.mo5561k0(6);
            } else {
                fVar.mo5562r(6, privateVideo.mo10490h());
            }
            fVar.mo5557L(7, privateVideo.mo10504u());
            fVar.mo5557L(8, privateVideo.mo10489g());
            fVar.mo5557L(9, (long) privateVideo.mo10509y());
            fVar.mo5557L(10, (long) privateVideo.mo10494k());
            if (privateVideo.mo10502s() == null) {
                fVar.mo5561k0(11);
            } else {
                fVar.mo5562r(11, privateVideo.mo10502s());
            }
            fVar.mo5557L(12, privateVideo.mo10486e());
            fVar.mo5557L(13, privateVideo.mo10484d());
            if (privateVideo.mo10492i() == null) {
                fVar.mo5561k0(14);
            } else {
                fVar.mo5562r(14, privateVideo.mo10492i());
            }
            if (privateVideo.mo10493j() == null) {
                fVar.mo5561k0(15);
            } else {
                fVar.mo5562r(15, privateVideo.mo10493j());
            }
            if (privateVideo.mo10505v() == null) {
                fVar.mo5561k0(16);
            } else {
                fVar.mo5562r(16, privateVideo.mo10505v());
            }
            fVar.mo5557L(17, privateVideo.mo10510z() ? 1 : 0);
            fVar.mo5557L(18, privateVideo.mo10501r());
            fVar.mo5557L(19, (long) privateVideo.mo10481b());
            fVar.mo5557L(20, (long) privateVideo.mo10479a());
            fVar.mo5557L(21, privateVideo.mo10500q());
            if (privateVideo.mo10498o() == null) {
                fVar.mo5561k0(22);
            } else {
                fVar.mo5562r(22, privateVideo.mo10498o());
            }
            if (privateVideo.mo10497n() == null) {
                fVar.mo5561k0(23);
            } else {
                fVar.mo5562r(23, privateVideo.mo10497n());
            }
            if (privateVideo.mo10499p() == null) {
                fVar.mo5561k0(24);
            } else {
                fVar.mo5562r(24, privateVideo.mo10499p());
            }
            Integer valueOf = privateVideo.mo10496m() == null ? null : Integer.valueOf(privateVideo.mo10496m().booleanValue() ? 1 : 0);
            if (valueOf == null) {
                fVar.mo5561k0(25);
            } else {
                fVar.mo5557L(25, (long) valueOf.intValue());
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.b$d */
    /* compiled from: PrivateVideoDao_Impl */
    class C2793d extends C0953f0<PrivateVideo> {
        C2793d(C2789b bVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "DELETE FROM `private` WHERE `video_id` = ?";
        }

        /* renamed from: j */
        public void mo5475g(C4222f fVar, PrivateVideo privateVideo) {
            fVar.mo5557L(1, privateVideo.mo10495l());
        }
    }

    /* renamed from: com.coocent.videostore.db.b$e */
    /* compiled from: PrivateVideoDao_Impl */
    class C2794e extends C0953f0<PrivateVideo> {
        C2794e(C2789b bVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE OR ABORT `private` SET `video_id` = ?,`uri` = ?,`path` = ?,`display_name` = ?,`title` = ?,`extension` = ?,`size` = ?,`duration` = ?,`width` = ?,`height` = ?,`mime_type` = ?,`date_taken` = ?,`date_modified` = ?,`folder_name` = ?,`folder_path` = ?,`thumbnail` = ?,`recent_added` = ?,`last_watch_time` = ?,`video_count` = ?,`video_recent_added_count` = ?,`last_playback_time` = ?,`last_copy_folder_uri` = ?,`last_copy_folder_path` = ?,`last_display_name` = ?,`is_private_video` = ? WHERE `video_id` = ?";
        }

        /* renamed from: j */
        public void mo5475g(C4222f fVar, PrivateVideo privateVideo) {
            fVar.mo5557L(1, privateVideo.mo10495l());
            if (privateVideo.mo10508x() == null) {
                fVar.mo5561k0(2);
            } else {
                fVar.mo5562r(2, privateVideo.mo10508x());
            }
            if (privateVideo.mo10503t() == null) {
                fVar.mo5561k0(3);
            } else {
                fVar.mo5562r(3, privateVideo.mo10503t());
            }
            if (privateVideo.mo10488f() == null) {
                fVar.mo5561k0(4);
            } else {
                fVar.mo5562r(4, privateVideo.mo10488f());
            }
            if (privateVideo.mo10506w() == null) {
                fVar.mo5561k0(5);
            } else {
                fVar.mo5562r(5, privateVideo.mo10506w());
            }
            if (privateVideo.mo10490h() == null) {
                fVar.mo5561k0(6);
            } else {
                fVar.mo5562r(6, privateVideo.mo10490h());
            }
            fVar.mo5557L(7, privateVideo.mo10504u());
            fVar.mo5557L(8, privateVideo.mo10489g());
            fVar.mo5557L(9, (long) privateVideo.mo10509y());
            fVar.mo5557L(10, (long) privateVideo.mo10494k());
            if (privateVideo.mo10502s() == null) {
                fVar.mo5561k0(11);
            } else {
                fVar.mo5562r(11, privateVideo.mo10502s());
            }
            fVar.mo5557L(12, privateVideo.mo10486e());
            fVar.mo5557L(13, privateVideo.mo10484d());
            if (privateVideo.mo10492i() == null) {
                fVar.mo5561k0(14);
            } else {
                fVar.mo5562r(14, privateVideo.mo10492i());
            }
            if (privateVideo.mo10493j() == null) {
                fVar.mo5561k0(15);
            } else {
                fVar.mo5562r(15, privateVideo.mo10493j());
            }
            if (privateVideo.mo10505v() == null) {
                fVar.mo5561k0(16);
            } else {
                fVar.mo5562r(16, privateVideo.mo10505v());
            }
            fVar.mo5557L(17, privateVideo.mo10510z() ? 1 : 0);
            fVar.mo5557L(18, privateVideo.mo10501r());
            fVar.mo5557L(19, (long) privateVideo.mo10481b());
            fVar.mo5557L(20, (long) privateVideo.mo10479a());
            fVar.mo5557L(21, privateVideo.mo10500q());
            if (privateVideo.mo10498o() == null) {
                fVar.mo5561k0(22);
            } else {
                fVar.mo5562r(22, privateVideo.mo10498o());
            }
            if (privateVideo.mo10497n() == null) {
                fVar.mo5561k0(23);
            } else {
                fVar.mo5562r(23, privateVideo.mo10497n());
            }
            if (privateVideo.mo10499p() == null) {
                fVar.mo5561k0(24);
            } else {
                fVar.mo5562r(24, privateVideo.mo10499p());
            }
            Integer valueOf = privateVideo.mo10496m() == null ? null : Integer.valueOf(privateVideo.mo10496m().booleanValue() ? 1 : 0);
            if (valueOf == null) {
                fVar.mo5561k0(25);
            } else {
                fVar.mo5557L(25, (long) valueOf.intValue());
            }
            fVar.mo5557L(26, privateVideo.mo10495l());
        }
    }

    /* renamed from: com.coocent.videostore.db.b$f */
    /* compiled from: PrivateVideoDao_Impl */
    class C2795f extends C1025z0 {
        C2795f(C2789b bVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE private SET last_playback_time = ? WHERE video_id = ?";
        }
    }

    /* renamed from: com.coocent.videostore.db.b$g */
    /* compiled from: PrivateVideoDao_Impl */
    class C2796g extends C1025z0 {
        C2796g(C2789b bVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE private SET is_private_video = ? WHERE video_id = ?";
        }
    }

    /* renamed from: com.coocent.videostore.db.b$h */
    /* compiled from: PrivateVideoDao_Impl */
    class C2797h extends C1025z0 {
        C2797h(C2789b bVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE private SET last_watch_time = ? WHERE video_id = ?";
        }
    }

    /* renamed from: com.coocent.videostore.db.b$i */
    /* compiled from: PrivateVideoDao_Impl */
    class C2798i extends C1025z0 {
        C2798i(C2789b bVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "DELETE FROM private WHERE video_id = ?";
        }
    }

    public C2789b(C0994s0 s0Var) {
        this.f9519a = s0Var;
        new C2791b(this, s0Var);
        new C2792c(this, s0Var);
        new C2793d(this, s0Var);
        new C2794e(this, s0Var);
        new C2795f(this, s0Var);
        new C2796g(this, s0Var);
        new C2797h(this, s0Var);
        this.f9520b = new C2798i(this, s0Var);
    }

    /* renamed from: d */
    public static List<Class<?>> m12594d() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public Object mo10392a(C8508d<? super List<? extends PrivateVideo>> dVar) {
        C1008v0 p = C1008v0.m5896p("SELECT * FROM private", 0);
        return C0927b0.m5685a(this.f9519a, false, C0941c.m5702a(), new C2790a(p), dVar);
    }

    /* renamed from: b */
    public void mo10393b(long j) {
        this.f9519a.mo5575b();
        C4222f a = this.f9520b.mo5690a();
        a.mo5557L(1, j);
        this.f9519a.mo5576c();
        try {
            a.mo5568u();
            this.f9519a.mo5573C();
        } finally {
            this.f9519a.mo5580g();
            this.f9520b.mo5693f(a);
        }
    }
}
