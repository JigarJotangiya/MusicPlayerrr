package com.coocent.videostore.p066db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.C0927b0;
import androidx.room.C0953f0;
import androidx.room.C0955g0;
import androidx.room.C0994s0;
import androidx.room.C1008v0;
import androidx.room.C1025z0;
import androidx.room.p006d1.C0940b;
import androidx.room.p006d1.C0941c;
import com.coocent.videostore.p067po.Video;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p082e.p149u.p150a.C4221e;
import p082e.p149u.p150a.C4222f;
import p369i.C8457t;
import p369i.p379w.C8508d;

/* renamed from: com.coocent.videostore.db.d */
/* compiled from: VideoDao_Impl */
public final class C2800d implements C2799c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0994s0 f9523a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0955g0<Video> f9524b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0953f0<Video> f9525c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C0953f0<Video> f9526d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1025z0 f9527e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1025z0 f9528f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1025z0 f9529g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1025z0 f9530h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1025z0 f9531i;

    /* renamed from: com.coocent.videostore.db.d$a */
    /* compiled from: VideoDao_Impl */
    class C2801a extends C1025z0 {
        C2801a(C2800d dVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "DELETE FROM video WHERE folder_path = ?";
        }
    }

    /* renamed from: com.coocent.videostore.db.d$a0 */
    /* compiled from: VideoDao_Impl */
    class C2802a0 extends C1025z0 {
        C2802a0(C2800d dVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE video SET is_private_video = ? WHERE video_id = ?";
        }
    }

    /* renamed from: com.coocent.videostore.db.d$b */
    /* compiled from: VideoDao_Impl */
    class C2803b implements Callable<C8457t> {

        /* renamed from: a */
        final /* synthetic */ Video f9532a;

        C2803b(Video video) {
            this.f9532a = video;
        }

        /* renamed from: a */
        public C8457t call() throws Exception {
            C2800d.this.f9523a.mo5576c();
            try {
                C2800d.this.f9524b.mo5479h(this.f9532a);
                C2800d.this.f9523a.mo5573C();
                return C8457t.f34900a;
            } finally {
                C2800d.this.f9523a.mo5580g();
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.d$c */
    /* compiled from: VideoDao_Impl */
    class C2804c implements Callable<Integer> {

        /* renamed from: a */
        final /* synthetic */ Video f9534a;

        C2804c(Video video) {
            this.f9534a = video;
        }

        /* renamed from: a */
        public Integer call() throws Exception {
            C2800d.this.f9523a.mo5576c();
            try {
                C2800d.this.f9523a.mo5573C();
                return Integer.valueOf(C2800d.this.f9525c.mo5476h(this.f9534a) + 0);
            } finally {
                C2800d.this.f9523a.mo5580g();
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.d$d */
    /* compiled from: VideoDao_Impl */
    class C2805d implements Callable<C8457t> {

        /* renamed from: a */
        final /* synthetic */ Collection f9536a;

        C2805d(Collection collection) {
            this.f9536a = collection;
        }

        /* renamed from: a */
        public C8457t call() throws Exception {
            C2800d.this.f9523a.mo5576c();
            try {
                C2800d.this.f9525c.mo5477i(this.f9536a);
                C2800d.this.f9523a.mo5573C();
                return C8457t.f34900a;
            } finally {
                C2800d.this.f9523a.mo5580g();
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.d$e */
    /* compiled from: VideoDao_Impl */
    class C2806e implements Callable<Integer> {

        /* renamed from: a */
        final /* synthetic */ Video f9538a;

        C2806e(Video video) {
            this.f9538a = video;
        }

        /* renamed from: a */
        public Integer call() throws Exception {
            C2800d.this.f9523a.mo5576c();
            try {
                C2800d.this.f9523a.mo5573C();
                return Integer.valueOf(C2800d.this.f9526d.mo5476h(this.f9538a) + 0);
            } finally {
                C2800d.this.f9523a.mo5580g();
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.d$f */
    /* compiled from: VideoDao_Impl */
    class C2807f implements Callable<Integer> {

        /* renamed from: a */
        final /* synthetic */ long f9540a;

        /* renamed from: b */
        final /* synthetic */ int f9541b;

        /* renamed from: c */
        final /* synthetic */ int f9542c;

        /* renamed from: d */
        final /* synthetic */ String f9543d;

        /* renamed from: e */
        final /* synthetic */ long f9544e;

        C2807f(long j, int i, int i2, String str, long j2) {
            this.f9540a = j;
            this.f9541b = i;
            this.f9542c = i2;
            this.f9543d = str;
            this.f9544e = j2;
        }

        /* renamed from: a */
        public Integer call() throws Exception {
            C4222f a = C2800d.this.f9527e.mo5690a();
            a.mo5557L(1, this.f9540a);
            a.mo5557L(2, (long) this.f9541b);
            a.mo5557L(3, (long) this.f9542c);
            String str = this.f9543d;
            if (str == null) {
                a.mo5561k0(4);
            } else {
                a.mo5562r(4, str);
            }
            a.mo5557L(5, this.f9544e);
            C2800d.this.f9523a.mo5576c();
            try {
                Integer valueOf = Integer.valueOf(a.mo5568u());
                C2800d.this.f9523a.mo5573C();
                return valueOf;
            } finally {
                C2800d.this.f9523a.mo5580g();
                C2800d.this.f9527e.mo5693f(a);
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.d$g */
    /* compiled from: VideoDao_Impl */
    class C2808g implements Callable<Integer> {

        /* renamed from: a */
        final /* synthetic */ String f9546a;

        /* renamed from: b */
        final /* synthetic */ String f9547b;

        /* renamed from: c */
        final /* synthetic */ String f9548c;

        /* renamed from: d */
        final /* synthetic */ long f9549d;

        C2808g(String str, String str2, String str3, long j) {
            this.f9546a = str;
            this.f9547b = str2;
            this.f9548c = str3;
            this.f9549d = j;
        }

        /* renamed from: a */
        public Integer call() throws Exception {
            C4222f a = C2800d.this.f9528f.mo5690a();
            String str = this.f9546a;
            if (str == null) {
                a.mo5561k0(1);
            } else {
                a.mo5562r(1, str);
            }
            String str2 = this.f9547b;
            if (str2 == null) {
                a.mo5561k0(2);
            } else {
                a.mo5562r(2, str2);
            }
            String str3 = this.f9548c;
            if (str3 == null) {
                a.mo5561k0(3);
            } else {
                a.mo5562r(3, str3);
            }
            a.mo5557L(4, this.f9549d);
            C2800d.this.f9523a.mo5576c();
            try {
                Integer valueOf = Integer.valueOf(a.mo5568u());
                C2800d.this.f9523a.mo5573C();
                return valueOf;
            } finally {
                C2800d.this.f9523a.mo5580g();
                C2800d.this.f9528f.mo5693f(a);
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.d$h */
    /* compiled from: VideoDao_Impl */
    class C2809h implements Callable<C8457t> {

        /* renamed from: a */
        final /* synthetic */ long f9551a;

        /* renamed from: b */
        final /* synthetic */ long f9552b;

        C2809h(long j, long j2) {
            this.f9551a = j;
            this.f9552b = j2;
        }

        /* renamed from: a */
        public C8457t call() throws Exception {
            C4222f a = C2800d.this.f9529g.mo5690a();
            a.mo5557L(1, this.f9551a);
            a.mo5557L(2, this.f9552b);
            C2800d.this.f9523a.mo5576c();
            try {
                a.mo5568u();
                C2800d.this.f9523a.mo5573C();
                return C8457t.f34900a;
            } finally {
                C2800d.this.f9523a.mo5580g();
                C2800d.this.f9529g.mo5693f(a);
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.d$i */
    /* compiled from: VideoDao_Impl */
    class C2810i implements Callable<C8457t> {

        /* renamed from: a */
        final /* synthetic */ long f9554a;

        /* renamed from: b */
        final /* synthetic */ long f9555b;

        C2810i(long j, long j2) {
            this.f9554a = j;
            this.f9555b = j2;
        }

        /* renamed from: a */
        public C8457t call() throws Exception {
            C4222f a = C2800d.this.f9530h.mo5690a();
            a.mo5557L(1, this.f9554a);
            a.mo5557L(2, this.f9555b);
            C2800d.this.f9523a.mo5576c();
            try {
                a.mo5568u();
                C2800d.this.f9523a.mo5573C();
                return C8457t.f34900a;
            } finally {
                C2800d.this.f9523a.mo5580g();
                C2800d.this.f9530h.mo5693f(a);
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.d$j */
    /* compiled from: VideoDao_Impl */
    class C2811j extends C0955g0<Video> {
        C2811j(C2800d dVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "INSERT OR ABORT INTO `video` (`video_id`,`uri`,`path`,`display_name`,`title`,`extension`,`size`,`duration`,`width`,`height`,`mime_type`,`date_taken`,`date_modified`,`folder_name`,`folder_path`,`thumbnail`,`recent_added`,`last_watch_time`,`video_count`,`video_recent_added_count`,`last_playback_time`,`last_copy_folder_uri`,`last_copy_folder_path`,`last_display_name`,`is_private_video`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: i */
        public void mo5478g(C4222f fVar, Video video) {
            fVar.mo5557L(1, video.mo10553l());
            if (video.mo10567x() == null) {
                fVar.mo5561k0(2);
            } else {
                fVar.mo5562r(2, video.mo10567x());
            }
            if (video.mo10561t() == null) {
                fVar.mo5561k0(3);
            } else {
                fVar.mo5562r(3, video.mo10561t());
            }
            if (video.mo10546f() == null) {
                fVar.mo5561k0(4);
            } else {
                fVar.mo5562r(4, video.mo10546f());
            }
            if (video.mo10565w() == null) {
                fVar.mo5561k0(5);
            } else {
                fVar.mo5562r(5, video.mo10565w());
            }
            if (video.mo10548h() == null) {
                fVar.mo5561k0(6);
            } else {
                fVar.mo5562r(6, video.mo10548h());
            }
            fVar.mo5557L(7, video.mo10563u());
            fVar.mo5557L(8, video.mo10547g());
            fVar.mo5557L(9, (long) video.mo10568y());
            fVar.mo5557L(10, (long) video.mo10552k());
            if (video.mo10560s() == null) {
                fVar.mo5561k0(11);
            } else {
                fVar.mo5562r(11, video.mo10560s());
            }
            fVar.mo5557L(12, video.mo10544e());
            fVar.mo5557L(13, video.mo10542d());
            if (video.mo10550i() == null) {
                fVar.mo5561k0(14);
            } else {
                fVar.mo5562r(14, video.mo10550i());
            }
            if (video.mo10551j() == null) {
                fVar.mo5561k0(15);
            } else {
                fVar.mo5562r(15, video.mo10551j());
            }
            if (video.mo10564v() == null) {
                fVar.mo5561k0(16);
            } else {
                fVar.mo5562r(16, video.mo10564v());
            }
            fVar.mo5557L(17, video.mo10569z() ? 1 : 0);
            fVar.mo5557L(18, video.mo10559r());
            fVar.mo5557L(19, (long) video.mo10539b());
            fVar.mo5557L(20, (long) video.mo10537a());
            fVar.mo5557L(21, video.mo10558q());
            if (video.mo10556o() == null) {
                fVar.mo5561k0(22);
            } else {
                fVar.mo5562r(22, video.mo10556o());
            }
            if (video.mo10555n() == null) {
                fVar.mo5561k0(23);
            } else {
                fVar.mo5562r(23, video.mo10555n());
            }
            if (video.mo10557p() == null) {
                fVar.mo5561k0(24);
            } else {
                fVar.mo5562r(24, video.mo10557p());
            }
            Integer valueOf = video.mo10554m() == null ? null : Integer.valueOf(video.mo10554m().booleanValue() ? 1 : 0);
            if (valueOf == null) {
                fVar.mo5561k0(25);
            } else {
                fVar.mo5557L(25, (long) valueOf.intValue());
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.d$k */
    /* compiled from: VideoDao_Impl */
    class C2812k implements Callable<C8457t> {

        /* renamed from: a */
        final /* synthetic */ boolean f9557a;

        /* renamed from: b */
        final /* synthetic */ long f9558b;

        C2812k(boolean z, long j) {
            this.f9557a = z;
            this.f9558b = j;
        }

        /* renamed from: a */
        public C8457t call() throws Exception {
            C4222f a = C2800d.this.f9531i.mo5690a();
            a.mo5557L(1, this.f9557a ? 1 : 0);
            a.mo5557L(2, this.f9558b);
            C2800d.this.f9523a.mo5576c();
            try {
                a.mo5568u();
                C2800d.this.f9523a.mo5573C();
                return C8457t.f34900a;
            } finally {
                C2800d.this.f9523a.mo5580g();
                C2800d.this.f9531i.mo5693f(a);
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.d$l */
    /* compiled from: VideoDao_Impl */
    class C2813l implements Callable<List<? extends Video>> {

        /* renamed from: a */
        final /* synthetic */ C1008v0 f9560a;

        C2813l(C1008v0 v0Var) {
            this.f9560a = v0Var;
        }

        /* renamed from: a */
        public List<? extends Video> call() throws Exception {
            C2813l lVar;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String string;
            String string2;
            boolean z;
            int i;
            int i2;
            String str7;
            String str8;
            int i3;
            String str9;
            String str10;
            Integer num;
            Boolean bool;
            Cursor c = C0941c.m5704c(C2800d.this.f9523a, this.f9560a, false, (CancellationSignal) null);
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
                        long j = c.getLong(e);
                        if (c.isNull(e2)) {
                            str = null;
                        } else {
                            str = c.getString(e2);
                        }
                        if (c.isNull(e3)) {
                            str2 = null;
                        } else {
                            str2 = c.getString(e3);
                        }
                        if (c.isNull(e4)) {
                            str3 = null;
                        } else {
                            str3 = c.getString(e4);
                        }
                        if (c.isNull(e5)) {
                            str4 = null;
                        } else {
                            str4 = c.getString(e5);
                        }
                        if (c.isNull(e6)) {
                            str5 = null;
                        } else {
                            str5 = c.getString(e6);
                        }
                        long j2 = c.getLong(e7);
                        long j3 = c.getLong(e8);
                        int i5 = c.getInt(e9);
                        int i6 = c.getInt(e10);
                        if (c.isNull(e11)) {
                            str6 = null;
                        } else {
                            str6 = c.getString(e11);
                        }
                        long j4 = c.getLong(e12);
                        long j5 = c.getLong(e13);
                        int i7 = i4;
                        if (c.isNull(i7)) {
                            string = null;
                        } else {
                            string = c.getString(i7);
                        }
                        int i8 = e15;
                        int i9 = e;
                        int i10 = i8;
                        if (c.isNull(i10)) {
                            string2 = null;
                        } else {
                            string2 = c.getString(i10);
                        }
                        int i11 = e17;
                        int i12 = i10;
                        int i13 = i11;
                        boolean z2 = true;
                        if (c.getInt(i13) != 0) {
                            i = i13;
                            z = true;
                        } else {
                            i = i13;
                            z = false;
                        }
                        Video video = new Video(j, str, str2, str3, str4, str5, j2, j3, i5, i6, str6, j4, j5, string, string2, z);
                        int i14 = e13;
                        int i15 = e16;
                        if (c.isNull(i15)) {
                            i2 = i15;
                            str7 = null;
                        } else {
                            i2 = i15;
                            str7 = c.getString(i15);
                        }
                        video.mo10536Z(str7);
                        int i16 = e2;
                        int i17 = e18;
                        int i18 = i7;
                        video.mo10531U(c.getLong(i17));
                        int i19 = e19;
                        video.mo10516B(c.getInt(i19));
                        int i20 = i17;
                        int i21 = e20;
                        video.mo10515A(c.getInt(i21));
                        int i22 = i19;
                        int i23 = e21;
                        int i24 = i21;
                        video.mo10530S(c.getLong(i23));
                        int i25 = e22;
                        if (c.isNull(i25)) {
                            str8 = null;
                        } else {
                            str8 = c.getString(i25);
                        }
                        video.mo10528Q(str8);
                        int i26 = e23;
                        if (c.isNull(i26)) {
                            i3 = i23;
                            str9 = null;
                        } else {
                            i3 = i23;
                            str9 = c.getString(i26);
                        }
                        video.mo10527P(str9);
                        int i27 = e24;
                        if (c.isNull(i27)) {
                            e24 = i27;
                            str10 = null;
                        } else {
                            e24 = i27;
                            str10 = c.getString(i27);
                        }
                        video.mo10529R(str10);
                        int i28 = e25;
                        if (c.isNull(i28)) {
                            num = null;
                        } else {
                            num = Integer.valueOf(c.getInt(i28));
                        }
                        if (num == null) {
                            e25 = i28;
                            bool = null;
                        } else {
                            if (num.intValue() == 0) {
                                z2 = false;
                            }
                            e25 = i28;
                            bool = Boolean.valueOf(z2);
                        }
                        video.mo10526O(bool);
                        arrayList.add(video);
                        e22 = i25;
                        e = i9;
                        e15 = i12;
                        e17 = i;
                        e13 = i14;
                        i4 = i18;
                        e18 = i20;
                        e19 = i22;
                        e20 = i24;
                        e21 = i3;
                        e23 = i26;
                        e2 = i16;
                        e16 = i2;
                    }
                    c.close();
                    this.f9560a.mo5622H();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    lVar = this;
                    c.close();
                    lVar.f9560a.mo5622H();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                lVar = this;
                c.close();
                lVar.f9560a.mo5622H();
                throw th;
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.d$m */
    /* compiled from: VideoDao_Impl */
    class C2814m implements Callable<List<? extends Video>> {

        /* renamed from: a */
        final /* synthetic */ C1008v0 f9562a;

        C2814m(C1008v0 v0Var) {
            this.f9562a = v0Var;
        }

        /* renamed from: a */
        public List<? extends Video> call() throws Exception {
            C2814m mVar;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String string;
            String string2;
            boolean z;
            int i;
            int i2;
            String str7;
            String str8;
            int i3;
            String str9;
            String str10;
            Integer num;
            Boolean bool;
            Cursor c = C0941c.m5704c(C2800d.this.f9523a, this.f9562a, false, (CancellationSignal) null);
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
                        long j = c.getLong(e);
                        if (c.isNull(e2)) {
                            str = null;
                        } else {
                            str = c.getString(e2);
                        }
                        if (c.isNull(e3)) {
                            str2 = null;
                        } else {
                            str2 = c.getString(e3);
                        }
                        if (c.isNull(e4)) {
                            str3 = null;
                        } else {
                            str3 = c.getString(e4);
                        }
                        if (c.isNull(e5)) {
                            str4 = null;
                        } else {
                            str4 = c.getString(e5);
                        }
                        if (c.isNull(e6)) {
                            str5 = null;
                        } else {
                            str5 = c.getString(e6);
                        }
                        long j2 = c.getLong(e7);
                        long j3 = c.getLong(e8);
                        int i5 = c.getInt(e9);
                        int i6 = c.getInt(e10);
                        if (c.isNull(e11)) {
                            str6 = null;
                        } else {
                            str6 = c.getString(e11);
                        }
                        long j4 = c.getLong(e12);
                        long j5 = c.getLong(e13);
                        int i7 = i4;
                        if (c.isNull(i7)) {
                            string = null;
                        } else {
                            string = c.getString(i7);
                        }
                        int i8 = e15;
                        int i9 = e;
                        int i10 = i8;
                        if (c.isNull(i10)) {
                            string2 = null;
                        } else {
                            string2 = c.getString(i10);
                        }
                        int i11 = e17;
                        int i12 = i10;
                        int i13 = i11;
                        boolean z2 = true;
                        if (c.getInt(i13) != 0) {
                            i = i13;
                            z = true;
                        } else {
                            i = i13;
                            z = false;
                        }
                        Video video = new Video(j, str, str2, str3, str4, str5, j2, j3, i5, i6, str6, j4, j5, string, string2, z);
                        int i14 = e13;
                        int i15 = e16;
                        if (c.isNull(i15)) {
                            i2 = i15;
                            str7 = null;
                        } else {
                            i2 = i15;
                            str7 = c.getString(i15);
                        }
                        video.mo10536Z(str7);
                        int i16 = e2;
                        int i17 = e18;
                        int i18 = i7;
                        video.mo10531U(c.getLong(i17));
                        int i19 = e19;
                        video.mo10516B(c.getInt(i19));
                        int i20 = i17;
                        int i21 = e20;
                        video.mo10515A(c.getInt(i21));
                        int i22 = i19;
                        int i23 = e21;
                        int i24 = i21;
                        video.mo10530S(c.getLong(i23));
                        int i25 = e22;
                        if (c.isNull(i25)) {
                            str8 = null;
                        } else {
                            str8 = c.getString(i25);
                        }
                        video.mo10528Q(str8);
                        int i26 = e23;
                        if (c.isNull(i26)) {
                            i3 = i23;
                            str9 = null;
                        } else {
                            i3 = i23;
                            str9 = c.getString(i26);
                        }
                        video.mo10527P(str9);
                        int i27 = e24;
                        if (c.isNull(i27)) {
                            e24 = i27;
                            str10 = null;
                        } else {
                            e24 = i27;
                            str10 = c.getString(i27);
                        }
                        video.mo10529R(str10);
                        int i28 = e25;
                        if (c.isNull(i28)) {
                            num = null;
                        } else {
                            num = Integer.valueOf(c.getInt(i28));
                        }
                        if (num == null) {
                            e25 = i28;
                            bool = null;
                        } else {
                            if (num.intValue() == 0) {
                                z2 = false;
                            }
                            e25 = i28;
                            bool = Boolean.valueOf(z2);
                        }
                        video.mo10526O(bool);
                        arrayList.add(video);
                        e22 = i25;
                        e = i9;
                        e15 = i12;
                        e17 = i;
                        e13 = i14;
                        i4 = i18;
                        e18 = i20;
                        e19 = i22;
                        e20 = i24;
                        e21 = i3;
                        e23 = i26;
                        e2 = i16;
                        e16 = i2;
                    }
                    c.close();
                    this.f9562a.mo5622H();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    mVar = this;
                    c.close();
                    mVar.f9562a.mo5622H();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                mVar = this;
                c.close();
                mVar.f9562a.mo5622H();
                throw th;
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.d$n */
    /* compiled from: VideoDao_Impl */
    class C2815n implements Callable<Video> {

        /* renamed from: a */
        final /* synthetic */ C1008v0 f9564a;

        C2815n(C1008v0 v0Var) {
            this.f9564a = v0Var;
        }

        /* renamed from: a */
        public Video call() throws Exception {
            Video video;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            int i;
            String str8;
            int i2;
            String str9;
            String str10;
            String str11;
            String str12;
            Integer num;
            Boolean bool;
            Cursor c = C0941c.m5704c(C2800d.this.f9523a, this.f9564a, false, (CancellationSignal) null);
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
                if (c.moveToFirst()) {
                    long j = c.getLong(e);
                    if (c.isNull(e2)) {
                        str = null;
                    } else {
                        str = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e5);
                    }
                    if (c.isNull(e6)) {
                        str5 = null;
                    } else {
                        str5 = c.getString(e6);
                    }
                    long j2 = c.getLong(e7);
                    long j3 = c.getLong(e8);
                    int i3 = c.getInt(e9);
                    int i4 = c.getInt(e10);
                    if (c.isNull(e11)) {
                        str6 = null;
                    } else {
                        str6 = c.getString(e11);
                    }
                    long j4 = c.getLong(e12);
                    long j5 = c.getLong(e13);
                    if (c.isNull(e14)) {
                        i = e15;
                        str7 = null;
                    } else {
                        str7 = c.getString(e14);
                        i = e15;
                    }
                    if (c.isNull(i)) {
                        i2 = e17;
                        str8 = null;
                    } else {
                        str8 = c.getString(i);
                        i2 = e17;
                    }
                    boolean z = true;
                    Video video2 = new Video(j, str, str2, str3, str4, str5, j2, j3, i3, i4, str6, j4, j5, str7, str8, c.getInt(i2) != 0);
                    int i5 = e16;
                    if (c.isNull(i5)) {
                        str9 = null;
                    } else {
                        str9 = c.getString(i5);
                    }
                    video2.mo10536Z(str9);
                    video2.mo10531U(c.getLong(e18));
                    video2.mo10516B(c.getInt(e19));
                    video2.mo10515A(c.getInt(e20));
                    video2.mo10530S(c.getLong(e21));
                    int i6 = e22;
                    if (c.isNull(i6)) {
                        str10 = null;
                    } else {
                        str10 = c.getString(i6);
                    }
                    video2.mo10528Q(str10);
                    int i7 = e23;
                    if (c.isNull(i7)) {
                        str11 = null;
                    } else {
                        str11 = c.getString(i7);
                    }
                    video2.mo10527P(str11);
                    int i8 = e24;
                    if (c.isNull(i8)) {
                        str12 = null;
                    } else {
                        str12 = c.getString(i8);
                    }
                    video2.mo10529R(str12);
                    if (c.isNull(e25)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(c.getInt(e25));
                    }
                    if (num == null) {
                        bool = null;
                    } else {
                        if (num.intValue() == 0) {
                            z = false;
                        }
                        bool = Boolean.valueOf(z);
                    }
                    video2.mo10526O(bool);
                    video = video2;
                } else {
                    video = null;
                }
                return video;
            } finally {
                c.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f9564a.mo5622H();
        }
    }

    /* renamed from: com.coocent.videostore.db.d$o */
    /* compiled from: VideoDao_Impl */
    class C2816o implements Callable<Video> {

        /* renamed from: a */
        final /* synthetic */ C1008v0 f9566a;

        C2816o(C1008v0 v0Var) {
            this.f9566a = v0Var;
        }

        /* renamed from: a */
        public Video call() throws Exception {
            Video video;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            int i;
            String str8;
            int i2;
            String str9;
            String str10;
            String str11;
            String str12;
            Integer num;
            Boolean bool;
            Cursor c = C0941c.m5704c(C2800d.this.f9523a, this.f9566a, false, (CancellationSignal) null);
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
                if (c.moveToFirst()) {
                    long j = c.getLong(e);
                    if (c.isNull(e2)) {
                        str = null;
                    } else {
                        str = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e5);
                    }
                    if (c.isNull(e6)) {
                        str5 = null;
                    } else {
                        str5 = c.getString(e6);
                    }
                    long j2 = c.getLong(e7);
                    long j3 = c.getLong(e8);
                    int i3 = c.getInt(e9);
                    int i4 = c.getInt(e10);
                    if (c.isNull(e11)) {
                        str6 = null;
                    } else {
                        str6 = c.getString(e11);
                    }
                    long j4 = c.getLong(e12);
                    long j5 = c.getLong(e13);
                    if (c.isNull(e14)) {
                        i = e15;
                        str7 = null;
                    } else {
                        str7 = c.getString(e14);
                        i = e15;
                    }
                    if (c.isNull(i)) {
                        i2 = e17;
                        str8 = null;
                    } else {
                        str8 = c.getString(i);
                        i2 = e17;
                    }
                    boolean z = true;
                    Video video2 = new Video(j, str, str2, str3, str4, str5, j2, j3, i3, i4, str6, j4, j5, str7, str8, c.getInt(i2) != 0);
                    int i5 = e16;
                    if (c.isNull(i5)) {
                        str9 = null;
                    } else {
                        str9 = c.getString(i5);
                    }
                    video2.mo10536Z(str9);
                    video2.mo10531U(c.getLong(e18));
                    video2.mo10516B(c.getInt(e19));
                    video2.mo10515A(c.getInt(e20));
                    video2.mo10530S(c.getLong(e21));
                    int i6 = e22;
                    if (c.isNull(i6)) {
                        str10 = null;
                    } else {
                        str10 = c.getString(i6);
                    }
                    video2.mo10528Q(str10);
                    int i7 = e23;
                    if (c.isNull(i7)) {
                        str11 = null;
                    } else {
                        str11 = c.getString(i7);
                    }
                    video2.mo10527P(str11);
                    int i8 = e24;
                    if (c.isNull(i8)) {
                        str12 = null;
                    } else {
                        str12 = c.getString(i8);
                    }
                    video2.mo10529R(str12);
                    if (c.isNull(e25)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(c.getInt(e25));
                    }
                    if (num == null) {
                        bool = null;
                    } else {
                        if (num.intValue() == 0) {
                            z = false;
                        }
                        bool = Boolean.valueOf(z);
                    }
                    video2.mo10526O(bool);
                    video = video2;
                } else {
                    video = null;
                }
                return video;
            } finally {
                c.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f9566a.mo5622H();
        }
    }

    /* renamed from: com.coocent.videostore.db.d$p */
    /* compiled from: VideoDao_Impl */
    class C2817p implements Callable<List<Video>> {

        /* renamed from: a */
        final /* synthetic */ C4221e f9568a;

        C2817p(C4221e eVar) {
            this.f9568a = eVar;
        }

        /* renamed from: a */
        public List<Video> call() throws Exception {
            Cursor c = C0941c.m5704c(C2800d.this.f9523a, this.f9568a, false, (CancellationSignal) null);
            try {
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(C2800d.this.m12636s(c));
                }
                return arrayList;
            } finally {
                c.close();
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.d$q */
    /* compiled from: VideoDao_Impl */
    class C2818q implements Callable<List<Video>> {

        /* renamed from: a */
        final /* synthetic */ C4221e f9570a;

        C2818q(C4221e eVar) {
            this.f9570a = eVar;
        }

        /* renamed from: a */
        public List<Video> call() throws Exception {
            Cursor c = C0941c.m5704c(C2800d.this.f9523a, this.f9570a, false, (CancellationSignal) null);
            try {
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(C2800d.this.m12636s(c));
                }
                return arrayList;
            } finally {
                c.close();
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.d$r */
    /* compiled from: VideoDao_Impl */
    class C2819r extends C0953f0<Video> {
        C2819r(C2800d dVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "DELETE FROM `video` WHERE `video_id` = ?";
        }

        /* renamed from: j */
        public void mo5475g(C4222f fVar, Video video) {
            fVar.mo5557L(1, video.mo10553l());
        }
    }

    /* renamed from: com.coocent.videostore.db.d$s */
    /* compiled from: VideoDao_Impl */
    class C2820s implements Callable<List<Video>> {

        /* renamed from: a */
        final /* synthetic */ C4221e f9572a;

        C2820s(C4221e eVar) {
            this.f9572a = eVar;
        }

        /* renamed from: a */
        public List<Video> call() throws Exception {
            Cursor c = C0941c.m5704c(C2800d.this.f9523a, this.f9572a, false, (CancellationSignal) null);
            try {
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(C2800d.this.m12636s(c));
                }
                return arrayList;
            } finally {
                c.close();
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.d$t */
    /* compiled from: VideoDao_Impl */
    class C2821t implements Callable<List<Video>> {

        /* renamed from: a */
        final /* synthetic */ C4221e f9574a;

        C2821t(C4221e eVar) {
            this.f9574a = eVar;
        }

        /* renamed from: a */
        public List<Video> call() throws Exception {
            Cursor c = C0941c.m5704c(C2800d.this.f9523a, this.f9574a, false, (CancellationSignal) null);
            try {
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(C2800d.this.m12636s(c));
                }
                return arrayList;
            } finally {
                c.close();
            }
        }
    }

    /* renamed from: com.coocent.videostore.db.d$u */
    /* compiled from: VideoDao_Impl */
    class C2822u extends C0953f0<Video> {
        C2822u(C2800d dVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE OR ABORT `video` SET `video_id` = ?,`uri` = ?,`path` = ?,`display_name` = ?,`title` = ?,`extension` = ?,`size` = ?,`duration` = ?,`width` = ?,`height` = ?,`mime_type` = ?,`date_taken` = ?,`date_modified` = ?,`folder_name` = ?,`folder_path` = ?,`thumbnail` = ?,`recent_added` = ?,`last_watch_time` = ?,`video_count` = ?,`video_recent_added_count` = ?,`last_playback_time` = ?,`last_copy_folder_uri` = ?,`last_copy_folder_path` = ?,`last_display_name` = ?,`is_private_video` = ? WHERE `video_id` = ?";
        }

        /* renamed from: j */
        public void mo5475g(C4222f fVar, Video video) {
            fVar.mo5557L(1, video.mo10553l());
            if (video.mo10567x() == null) {
                fVar.mo5561k0(2);
            } else {
                fVar.mo5562r(2, video.mo10567x());
            }
            if (video.mo10561t() == null) {
                fVar.mo5561k0(3);
            } else {
                fVar.mo5562r(3, video.mo10561t());
            }
            if (video.mo10546f() == null) {
                fVar.mo5561k0(4);
            } else {
                fVar.mo5562r(4, video.mo10546f());
            }
            if (video.mo10565w() == null) {
                fVar.mo5561k0(5);
            } else {
                fVar.mo5562r(5, video.mo10565w());
            }
            if (video.mo10548h() == null) {
                fVar.mo5561k0(6);
            } else {
                fVar.mo5562r(6, video.mo10548h());
            }
            fVar.mo5557L(7, video.mo10563u());
            fVar.mo5557L(8, video.mo10547g());
            fVar.mo5557L(9, (long) video.mo10568y());
            fVar.mo5557L(10, (long) video.mo10552k());
            if (video.mo10560s() == null) {
                fVar.mo5561k0(11);
            } else {
                fVar.mo5562r(11, video.mo10560s());
            }
            fVar.mo5557L(12, video.mo10544e());
            fVar.mo5557L(13, video.mo10542d());
            if (video.mo10550i() == null) {
                fVar.mo5561k0(14);
            } else {
                fVar.mo5562r(14, video.mo10550i());
            }
            if (video.mo10551j() == null) {
                fVar.mo5561k0(15);
            } else {
                fVar.mo5562r(15, video.mo10551j());
            }
            if (video.mo10564v() == null) {
                fVar.mo5561k0(16);
            } else {
                fVar.mo5562r(16, video.mo10564v());
            }
            fVar.mo5557L(17, video.mo10569z() ? 1 : 0);
            fVar.mo5557L(18, video.mo10559r());
            fVar.mo5557L(19, (long) video.mo10539b());
            fVar.mo5557L(20, (long) video.mo10537a());
            fVar.mo5557L(21, video.mo10558q());
            if (video.mo10556o() == null) {
                fVar.mo5561k0(22);
            } else {
                fVar.mo5562r(22, video.mo10556o());
            }
            if (video.mo10555n() == null) {
                fVar.mo5561k0(23);
            } else {
                fVar.mo5562r(23, video.mo10555n());
            }
            if (video.mo10557p() == null) {
                fVar.mo5561k0(24);
            } else {
                fVar.mo5562r(24, video.mo10557p());
            }
            Integer valueOf = video.mo10554m() == null ? null : Integer.valueOf(video.mo10554m().booleanValue() ? 1 : 0);
            if (valueOf == null) {
                fVar.mo5561k0(25);
            } else {
                fVar.mo5557L(25, (long) valueOf.intValue());
            }
            fVar.mo5557L(26, video.mo10553l());
        }
    }

    /* renamed from: com.coocent.videostore.db.d$v */
    /* compiled from: VideoDao_Impl */
    class C2823v extends C1025z0 {
        C2823v(C2800d dVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE video SET duration = ?, width = ?, height = ?, thumbnail = ? WHERE video_id = ?";
        }
    }

    /* renamed from: com.coocent.videostore.db.d$w */
    /* compiled from: VideoDao_Impl */
    class C2824w extends C1025z0 {
        C2824w(C2800d dVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE video SET title = ?, display_name = ?, path = ? WHERE video_id = ?";
        }
    }

    /* renamed from: com.coocent.videostore.db.d$x */
    /* compiled from: VideoDao_Impl */
    class C2825x extends C1025z0 {
        C2825x(C2800d dVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE video SET last_watch_time = ? WHERE video_id = ?";
        }
    }

    /* renamed from: com.coocent.videostore.db.d$y */
    /* compiled from: VideoDao_Impl */
    class C2826y extends C1025z0 {
        C2826y(C2800d dVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE video SET folder_name = ?,folder_path = ? WHERE video_id = ? ";
        }
    }

    /* renamed from: com.coocent.videostore.db.d$z */
    /* compiled from: VideoDao_Impl */
    class C2827z extends C1025z0 {
        C2827z(C2800d dVar, C0994s0 s0Var) {
            super(s0Var);
        }

        /* renamed from: d */
        public String mo5692d() {
            return "UPDATE video SET last_playback_time = ? WHERE video_id = ?";
        }
    }

    public C2800d(C0994s0 s0Var) {
        this.f9523a = s0Var;
        this.f9524b = new C2811j(this, s0Var);
        this.f9525c = new C2819r(this, s0Var);
        this.f9526d = new C2822u(this, s0Var);
        this.f9527e = new C2823v(this, s0Var);
        this.f9528f = new C2824w(this, s0Var);
        this.f9529g = new C2825x(this, s0Var);
        new C2826y(this, s0Var);
        this.f9530h = new C2827z(this, s0Var);
        this.f9531i = new C2802a0(this, s0Var);
        new C2801a(this, s0Var);
    }

    /* renamed from: D */
    public static List<Class<?>> m12635D() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public Video m12636s(Cursor cursor) {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j2;
        long j3;
        int i;
        int i2;
        String str6;
        long j4;
        String string;
        String str7;
        boolean z;
        Integer num;
        String str8;
        String str9;
        String str10;
        String str11;
        Cursor cursor2 = cursor;
        int columnIndex = cursor2.getColumnIndex("video_id");
        int columnIndex2 = cursor2.getColumnIndex("uri");
        int columnIndex3 = cursor2.getColumnIndex("path");
        int columnIndex4 = cursor2.getColumnIndex("display_name");
        int columnIndex5 = cursor2.getColumnIndex("title");
        int columnIndex6 = cursor2.getColumnIndex("extension");
        int columnIndex7 = cursor2.getColumnIndex("size");
        int columnIndex8 = cursor2.getColumnIndex("duration");
        int columnIndex9 = cursor2.getColumnIndex("width");
        int columnIndex10 = cursor2.getColumnIndex("height");
        int columnIndex11 = cursor2.getColumnIndex("mime_type");
        int columnIndex12 = cursor2.getColumnIndex("date_taken");
        int columnIndex13 = cursor2.getColumnIndex("date_modified");
        int columnIndex14 = cursor2.getColumnIndex("folder_name");
        int columnIndex15 = cursor2.getColumnIndex("folder_path");
        int columnIndex16 = cursor2.getColumnIndex("thumbnail");
        int columnIndex17 = cursor2.getColumnIndex("recent_added");
        int columnIndex18 = cursor2.getColumnIndex("last_watch_time");
        int columnIndex19 = cursor2.getColumnIndex("video_count");
        int columnIndex20 = cursor2.getColumnIndex("video_recent_added_count");
        int columnIndex21 = cursor2.getColumnIndex("last_playback_time");
        int columnIndex22 = cursor2.getColumnIndex("last_copy_folder_uri");
        int columnIndex23 = cursor2.getColumnIndex("last_copy_folder_path");
        int columnIndex24 = cursor2.getColumnIndex("last_display_name");
        long j5 = 0;
        int columnIndex25 = cursor2.getColumnIndex("is_private_video");
        if (columnIndex == -1) {
            j = 0;
        } else {
            j = cursor2.getLong(columnIndex);
        }
        Boolean bool = null;
        if (columnIndex2 != -1 && !cursor2.isNull(columnIndex2)) {
            str = cursor2.getString(columnIndex2);
        } else {
            str = null;
        }
        if (columnIndex3 != -1 && !cursor2.isNull(columnIndex3)) {
            str2 = cursor2.getString(columnIndex3);
        } else {
            str2 = null;
        }
        if (columnIndex4 != -1 && !cursor2.isNull(columnIndex4)) {
            str3 = cursor2.getString(columnIndex4);
        } else {
            str3 = null;
        }
        if (columnIndex5 != -1 && !cursor2.isNull(columnIndex5)) {
            str4 = cursor2.getString(columnIndex5);
        } else {
            str4 = null;
        }
        if (columnIndex6 != -1 && !cursor2.isNull(columnIndex6)) {
            str5 = cursor2.getString(columnIndex6);
        } else {
            str5 = null;
        }
        if (columnIndex7 == -1) {
            j2 = 0;
        } else {
            j2 = cursor2.getLong(columnIndex7);
        }
        if (columnIndex8 == -1) {
            j3 = 0;
        } else {
            j3 = cursor2.getLong(columnIndex8);
        }
        boolean z2 = false;
        if (columnIndex9 == -1) {
            i = 0;
        } else {
            i = cursor2.getInt(columnIndex9);
        }
        if (columnIndex10 == -1) {
            i2 = 0;
        } else {
            i2 = cursor2.getInt(columnIndex10);
        }
        if (columnIndex11 != -1 && !cursor2.isNull(columnIndex11)) {
            str6 = cursor2.getString(columnIndex11);
        } else {
            str6 = null;
        }
        if (columnIndex12 == -1) {
            j4 = 0;
        } else {
            j4 = cursor2.getLong(columnIndex12);
        }
        if (columnIndex13 != -1) {
            j5 = cursor2.getLong(columnIndex13);
        }
        long j6 = j5;
        if (columnIndex14 != -1 && !cursor2.isNull(columnIndex14)) {
            string = cursor2.getString(columnIndex14);
        } else {
            string = null;
        }
        int i3 = columnIndex15;
        if (i3 != -1 && !cursor2.isNull(i3)) {
            str7 = cursor2.getString(i3);
        } else {
            str7 = null;
        }
        int i4 = columnIndex17;
        if (i4 == -1) {
            z = false;
        } else {
            z = cursor2.getInt(i4) != 0;
        }
        Video video = new Video(j, str, str2, str3, str4, str5, j2, j3, i, i2, str6, j4, j6, string, str7, z);
        int i5 = columnIndex16;
        if (i5 != -1) {
            if (cursor2.isNull(i5)) {
                str11 = null;
            } else {
                str11 = cursor2.getString(i5);
            }
            video.mo10536Z(str11);
        }
        int i6 = columnIndex18;
        if (i6 != -1) {
            video.mo10531U(cursor2.getLong(i6));
        }
        int i7 = columnIndex19;
        if (i7 != -1) {
            video.mo10516B(cursor2.getInt(i7));
        }
        int i8 = columnIndex20;
        if (i8 != -1) {
            video.mo10515A(cursor2.getInt(i8));
        }
        int i9 = columnIndex21;
        if (i9 != -1) {
            video.mo10530S(cursor2.getLong(i9));
        }
        int i10 = columnIndex22;
        if (i10 != -1) {
            if (cursor2.isNull(i10)) {
                str10 = null;
            } else {
                str10 = cursor2.getString(i10);
            }
            video.mo10528Q(str10);
        }
        int i11 = columnIndex23;
        if (i11 != -1) {
            if (cursor2.isNull(i11)) {
                str9 = null;
            } else {
                str9 = cursor2.getString(i11);
            }
            video.mo10527P(str9);
        }
        int i12 = columnIndex24;
        if (i12 != -1) {
            if (cursor2.isNull(i12)) {
                str8 = null;
            } else {
                str8 = cursor2.getString(i12);
            }
            video.mo10529R(str8);
        }
        int i13 = columnIndex25;
        if (i13 != -1) {
            if (cursor2.isNull(i13)) {
                num = null;
            } else {
                num = Integer.valueOf(cursor2.getInt(i13));
            }
            if (num != null) {
                if (num.intValue() != 0) {
                    z2 = true;
                }
                bool = Boolean.valueOf(z2);
            }
            video.mo10526O(bool);
        }
        return video;
    }

    /* renamed from: a */
    public Object mo10400a(C8508d<? super List<? extends Video>> dVar) {
        C1008v0 p = C1008v0.m5896p("SELECT * FROM video", 0);
        return C0927b0.m5685a(this.f9523a, false, C0941c.m5702a(), new C2813l(p), dVar);
    }

    /* renamed from: b */
    public LiveData<List<Video>> mo10401b(C4221e eVar) {
        return this.f9523a.mo5583j().mo5496e(new String[]{"video"}, false, new C2818q(eVar));
    }

    /* renamed from: c */
    public Object mo10402c(Video video, C8508d<? super Integer> dVar) {
        return C0927b0.m5686b(this.f9523a, true, new C2804c(video), dVar);
    }

    /* renamed from: d */
    public Object mo10403d(Video video, C8508d<? super C8457t> dVar) {
        return C0927b0.m5686b(this.f9523a, true, new C2803b(video), dVar);
    }

    /* renamed from: e */
    public Object mo10404e(String str, C8508d<? super List<? extends Video>> dVar) {
        C1008v0 p = C1008v0.m5896p("SELECT * FROM video WHERE folder_path = ?", 1);
        if (str == null) {
            p.mo5561k0(1);
        } else {
            p.mo5562r(1, str);
        }
        return C0927b0.m5685a(this.f9523a, false, C0941c.m5702a(), new C2814m(p), dVar);
    }

    /* renamed from: f */
    public LiveData<List<Video>> mo10405f(C4221e eVar) {
        return this.f9523a.mo5583j().mo5496e(new String[]{"video"}, false, new C2820s(eVar));
    }

    /* renamed from: g */
    public Video mo10406g(int i) {
        C1008v0 v0Var;
        Video video;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i2;
        String str8;
        int i3;
        String str9;
        String str10;
        String str11;
        String str12;
        Integer num;
        Boolean bool;
        C1008v0 p = C1008v0.m5896p("SELECT * FROM video WHERE is_private_video= ? AND last_playback_time = (SELECT max(last_playback_time) FROM video) ", 1);
        p.mo5557L(1, (long) i);
        this.f9523a.mo5575b();
        Cursor c = C0941c.m5704c(this.f9523a, p, false, (CancellationSignal) null);
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
            v0Var = p;
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
                if (c.moveToFirst()) {
                    long j = c.getLong(e);
                    if (c.isNull(e2)) {
                        str = null;
                    } else {
                        str = c.getString(e2);
                    }
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e5);
                    }
                    if (c.isNull(e6)) {
                        str5 = null;
                    } else {
                        str5 = c.getString(e6);
                    }
                    long j2 = c.getLong(e7);
                    long j3 = c.getLong(e8);
                    int i4 = c.getInt(e9);
                    int i5 = c.getInt(e10);
                    if (c.isNull(e11)) {
                        str6 = null;
                    } else {
                        str6 = c.getString(e11);
                    }
                    long j4 = c.getLong(e12);
                    long j5 = c.getLong(e13);
                    if (c.isNull(e14)) {
                        i2 = e15;
                        str7 = null;
                    } else {
                        str7 = c.getString(e14);
                        i2 = e15;
                    }
                    if (c.isNull(i2)) {
                        i3 = e17;
                        str8 = null;
                    } else {
                        str8 = c.getString(i2);
                        i3 = e17;
                    }
                    Video video2 = new Video(j, str, str2, str3, str4, str5, j2, j3, i4, i5, str6, j4, j5, str7, str8, c.getInt(i3) != 0);
                    int i6 = e16;
                    if (c.isNull(i6)) {
                        str9 = null;
                    } else {
                        str9 = c.getString(i6);
                    }
                    video2.mo10536Z(str9);
                    video2.mo10531U(c.getLong(e18));
                    video2.mo10516B(c.getInt(e19));
                    video2.mo10515A(c.getInt(e20));
                    video2.mo10530S(c.getLong(e21));
                    int i7 = e22;
                    if (c.isNull(i7)) {
                        str10 = null;
                    } else {
                        str10 = c.getString(i7);
                    }
                    video2.mo10528Q(str10);
                    int i8 = e23;
                    if (c.isNull(i8)) {
                        str11 = null;
                    } else {
                        str11 = c.getString(i8);
                    }
                    video2.mo10527P(str11);
                    int i9 = e24;
                    if (c.isNull(i9)) {
                        str12 = null;
                    } else {
                        str12 = c.getString(i9);
                    }
                    video2.mo10529R(str12);
                    if (c.isNull(e25)) {
                        num = null;
                    } else {
                        num = Integer.valueOf(c.getInt(e25));
                    }
                    if (num == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(num.intValue() != 0);
                    }
                    video2.mo10526O(bool);
                    video = video2;
                } else {
                    video = null;
                }
                c.close();
                v0Var.mo5622H();
                return video;
            } catch (Throwable th) {
                th = th;
                c.close();
                v0Var.mo5622H();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            v0Var = p;
            c.close();
            v0Var.mo5622H();
            throw th;
        }
    }

    /* renamed from: h */
    public Object mo10407h(long j, long j2, C8508d<? super C8457t> dVar) {
        return C0927b0.m5686b(this.f9523a, true, new C2810i(j2, j), dVar);
    }

    /* renamed from: i */
    public Object mo10408i(long j, long j2, C8508d<? super C8457t> dVar) {
        return C0927b0.m5686b(this.f9523a, true, new C2809h(j2, j), dVar);
    }

    /* renamed from: j */
    public Object mo10409j(long j, String str, String str2, String str3, C8508d<? super Integer> dVar) {
        return C0927b0.m5686b(this.f9523a, true, new C2808g(str, str2, str3, j), dVar);
    }

    /* renamed from: k */
    public Object mo10410k(long j, long j2, int i, int i2, String str, C8508d<? super Integer> dVar) {
        return C0927b0.m5686b(this.f9523a, true, new C2807f(j2, i, i2, str, j), dVar);
    }

    /* renamed from: l */
    public LiveData<List<Video>> mo10411l(C4221e eVar) {
        return this.f9523a.mo5583j().mo5496e(new String[]{"video"}, false, new C2817p(eVar));
    }

    /* renamed from: m */
    public LiveData<Video> mo10412m(long j) {
        C1008v0 p = C1008v0.m5896p("SELECT * FROM video WHERE video_id = ?", 1);
        p.mo5557L(1, j);
        return this.f9523a.mo5583j().mo5496e(new String[]{"video"}, false, new C2816o(p));
    }

    /* renamed from: n */
    public Object mo10413n(Collection<? extends Video> collection, C8508d<? super C8457t> dVar) {
        return C0927b0.m5686b(this.f9523a, true, new C2805d(collection), dVar);
    }

    /* renamed from: o */
    public Object mo10414o(long j, boolean z, C8508d<? super C8457t> dVar) {
        return C0927b0.m5686b(this.f9523a, true, new C2812k(z, j), dVar);
    }

    /* renamed from: p */
    public LiveData<Video> mo10415p(String str) {
        C1008v0 p = C1008v0.m5896p("SELECT * FROM video WHERE uri = ?", 1);
        if (str == null) {
            p.mo5561k0(1);
        } else {
            p.mo5562r(1, str);
        }
        return this.f9523a.mo5583j().mo5496e(new String[]{"video"}, false, new C2815n(p));
    }

    /* renamed from: q */
    public Object mo10416q(Video video, C8508d<? super Integer> dVar) {
        return C0927b0.m5686b(this.f9523a, true, new C2806e(video), dVar);
    }

    /* renamed from: r */
    public LiveData<List<Video>> mo10417r(C4221e eVar) {
        return this.f9523a.mo5583j().mo5496e(new String[]{"video"}, false, new C2821t(eVar));
    }
}
