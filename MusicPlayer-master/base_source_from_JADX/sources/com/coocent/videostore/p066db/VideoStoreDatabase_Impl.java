package com.coocent.videostore.p066db;

import androidx.room.C0938d0;
import androidx.room.C0967k0;
import androidx.room.C0994s0;
import androidx.room.C1004u0;
import androidx.room.p006d1.C0941c;
import androidx.room.p006d1.C0945g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p082e.p149u.p150a.C4214b;
import p082e.p149u.p150a.C4215c;

/* renamed from: com.coocent.videostore.db.VideoStoreDatabase_Impl */
public final class VideoStoreDatabase_Impl extends VideoStoreDatabase {

    /* renamed from: o */
    private volatile C2799c f9516o;

    /* renamed from: p */
    private volatile C2788a f9517p;

    /* renamed from: com.coocent.videostore.db.VideoStoreDatabase_Impl$a */
    class C2787a extends C1004u0.C1005a {
        C2787a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo5615a(C4214b bVar) {
            bVar.mo5543q("CREATE TABLE IF NOT EXISTS `video` (`video_id` INTEGER NOT NULL, `uri` TEXT, `path` TEXT, `display_name` TEXT, `title` TEXT, `extension` TEXT, `size` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `mime_type` TEXT, `date_taken` INTEGER NOT NULL, `date_modified` INTEGER NOT NULL, `folder_name` TEXT, `folder_path` TEXT, `thumbnail` TEXT, `recent_added` INTEGER NOT NULL, `last_watch_time` INTEGER NOT NULL, `video_count` INTEGER NOT NULL, `video_recent_added_count` INTEGER NOT NULL, `last_playback_time` INTEGER NOT NULL, `last_copy_folder_uri` TEXT, `last_copy_folder_path` TEXT, `last_display_name` TEXT, `is_private_video` INTEGER, PRIMARY KEY(`video_id`))");
            bVar.mo5543q("CREATE TABLE IF NOT EXISTS `private` (`video_id` INTEGER NOT NULL, `uri` TEXT, `path` TEXT, `display_name` TEXT, `title` TEXT, `extension` TEXT, `size` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `mime_type` TEXT, `date_taken` INTEGER NOT NULL, `date_modified` INTEGER NOT NULL, `folder_name` TEXT, `folder_path` TEXT, `thumbnail` TEXT, `recent_added` INTEGER NOT NULL, `last_watch_time` INTEGER NOT NULL, `video_count` INTEGER NOT NULL, `video_recent_added_count` INTEGER NOT NULL, `last_playback_time` INTEGER NOT NULL, `last_copy_folder_uri` TEXT, `last_copy_folder_path` TEXT, `last_display_name` TEXT, `is_private_video` INTEGER, PRIMARY KEY(`video_id`))");
            bVar.mo5543q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.mo5543q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7516217ba2c1e38058d6713778b28334')");
        }

        /* renamed from: b */
        public void mo5616b(C4214b bVar) {
            bVar.mo5543q("DROP TABLE IF EXISTS `video`");
            bVar.mo5543q("DROP TABLE IF EXISTS `private`");
            if (VideoStoreDatabase_Impl.this.f4233h != null) {
                int size = VideoStoreDatabase_Impl.this.f4233h.size();
                for (int i = 0; i < size; i++) {
                    ((C0994s0.C0996b) VideoStoreDatabase_Impl.this.f4233h.get(i)).mo5603b(bVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo5617c(C4214b bVar) {
            if (VideoStoreDatabase_Impl.this.f4233h != null) {
                int size = VideoStoreDatabase_Impl.this.f4233h.size();
                for (int i = 0; i < size; i++) {
                    ((C0994s0.C0996b) VideoStoreDatabase_Impl.this.f4233h.get(i)).mo5602a(bVar);
                }
            }
        }

        /* renamed from: d */
        public void mo5618d(C4214b bVar) {
            C4214b unused = VideoStoreDatabase_Impl.this.f4226a = bVar;
            VideoStoreDatabase_Impl.this.mo5590s(bVar);
            if (VideoStoreDatabase_Impl.this.f4233h != null) {
                int size = VideoStoreDatabase_Impl.this.f4233h.size();
                for (int i = 0; i < size; i++) {
                    ((C0994s0.C0996b) VideoStoreDatabase_Impl.this.f4233h.get(i)).mo5604c(bVar);
                }
            }
        }

        /* renamed from: e */
        public void mo5619e(C4214b bVar) {
        }

        /* renamed from: f */
        public void mo5620f(C4214b bVar) {
            C0941c.m5703b(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C1004u0.C1006b mo5621g(C4214b bVar) {
            C4214b bVar2 = bVar;
            HashMap hashMap = new HashMap(25);
            hashMap.put("video_id", new C0945g.C0946a("video_id", "INTEGER", true, 1, (String) null, 1));
            hashMap.put("uri", new C0945g.C0946a("uri", "TEXT", false, 0, (String) null, 1));
            hashMap.put("path", new C0945g.C0946a("path", "TEXT", false, 0, (String) null, 1));
            hashMap.put("display_name", new C0945g.C0946a("display_name", "TEXT", false, 0, (String) null, 1));
            hashMap.put("title", new C0945g.C0946a("title", "TEXT", false, 0, (String) null, 1));
            hashMap.put("extension", new C0945g.C0946a("extension", "TEXT", false, 0, (String) null, 1));
            hashMap.put("size", new C0945g.C0946a("size", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("duration", new C0945g.C0946a("duration", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("width", new C0945g.C0946a("width", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("height", new C0945g.C0946a("height", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("mime_type", new C0945g.C0946a("mime_type", "TEXT", false, 0, (String) null, 1));
            hashMap.put("date_taken", new C0945g.C0946a("date_taken", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("date_modified", new C0945g.C0946a("date_modified", "INTEGER", true, 0, (String) null, 1));
            Object obj = "date_modified";
            hashMap.put("folder_name", new C0945g.C0946a("folder_name", "TEXT", false, 0, (String) null, 1));
            Object obj2 = "folder_name";
            hashMap.put("folder_path", new C0945g.C0946a("folder_path", "TEXT", false, 0, (String) null, 1));
            Object obj3 = "folder_path";
            hashMap.put("thumbnail", new C0945g.C0946a("thumbnail", "TEXT", false, 0, (String) null, 1));
            Object obj4 = "thumbnail";
            hashMap.put("recent_added", new C0945g.C0946a("recent_added", "INTEGER", true, 0, (String) null, 1));
            Object obj5 = "recent_added";
            hashMap.put("last_watch_time", new C0945g.C0946a("last_watch_time", "INTEGER", true, 0, (String) null, 1));
            Object obj6 = "last_watch_time";
            hashMap.put("video_count", new C0945g.C0946a("video_count", "INTEGER", true, 0, (String) null, 1));
            Object obj7 = "video_count";
            hashMap.put("video_recent_added_count", new C0945g.C0946a("video_recent_added_count", "INTEGER", true, 0, (String) null, 1));
            Object obj8 = "video_recent_added_count";
            hashMap.put("last_playback_time", new C0945g.C0946a("last_playback_time", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("last_copy_folder_uri", new C0945g.C0946a("last_copy_folder_uri", "TEXT", false, 0, (String) null, 1));
            hashMap.put("last_copy_folder_path", new C0945g.C0946a("last_copy_folder_path", "TEXT", false, 0, (String) null, 1));
            hashMap.put("last_display_name", new C0945g.C0946a("last_display_name", "TEXT", false, 0, (String) null, 1));
            hashMap.put("is_private_video", new C0945g.C0946a("is_private_video", "INTEGER", false, 0, (String) null, 1));
            Object obj9 = "date_taken";
            Object obj10 = "mime_type";
            C0945g gVar = new C0945g("video", hashMap, new HashSet(0), new HashSet(0));
            C0945g a = C0945g.m5711a(bVar2, "video");
            if (!gVar.equals(a)) {
                return new C1004u0.C1006b(false, "video(com.coocent.videostore.po.Video).\n Expected:\n" + gVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("video_id", new C0945g.C0946a("video_id", "INTEGER", true, 1, (String) null, 1));
            hashMap2.put("uri", new C0945g.C0946a("uri", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("path", new C0945g.C0946a("path", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("display_name", new C0945g.C0946a("display_name", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("title", new C0945g.C0946a("title", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("extension", new C0945g.C0946a("extension", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("size", new C0945g.C0946a("size", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("duration", new C0945g.C0946a("duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("width", new C0945g.C0946a("width", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("height", new C0945g.C0946a("height", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put(obj10, new C0945g.C0946a("mime_type", "TEXT", false, 0, (String) null, 1));
            hashMap2.put(obj9, new C0945g.C0946a("date_taken", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put(obj, new C0945g.C0946a("date_modified", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put(obj2, new C0945g.C0946a("folder_name", "TEXT", false, 0, (String) null, 1));
            hashMap2.put(obj3, new C0945g.C0946a("folder_path", "TEXT", false, 0, (String) null, 1));
            hashMap2.put(obj4, new C0945g.C0946a("thumbnail", "TEXT", false, 0, (String) null, 1));
            hashMap2.put(obj5, new C0945g.C0946a("recent_added", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put(obj6, new C0945g.C0946a("last_watch_time", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put(obj7, new C0945g.C0946a("video_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put(obj8, new C0945g.C0946a("video_recent_added_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("last_playback_time", new C0945g.C0946a("last_playback_time", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("last_copy_folder_uri", new C0945g.C0946a("last_copy_folder_uri", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("last_copy_folder_path", new C0945g.C0946a("last_copy_folder_path", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("last_display_name", new C0945g.C0946a("last_display_name", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("is_private_video", new C0945g.C0946a("is_private_video", "INTEGER", false, 0, (String) null, 1));
            C0945g gVar2 = new C0945g("private", hashMap2, new HashSet(0), new HashSet(0));
            C0945g a2 = C0945g.m5711a(bVar2, "private");
            if (gVar2.equals(a2)) {
                return new C1004u0.C1006b(true, (String) null);
            }
            return new C1004u0.C1006b(false, "private(com.coocent.videostore.po.PrivateVideo).\n Expected:\n" + gVar2 + "\n Found:\n" + a2);
        }
    }

    /* renamed from: E */
    public C2788a mo10389E() {
        C2788a aVar;
        if (this.f9517p != null) {
            return this.f9517p;
        }
        synchronized (this) {
            if (this.f9517p == null) {
                this.f9517p = new C2789b(this);
            }
            aVar = this.f9517p;
        }
        return aVar;
    }

    /* renamed from: F */
    public C2799c mo10390F() {
        C2799c cVar;
        if (this.f9516o != null) {
            return this.f9516o;
        }
        synchronized (this) {
            if (this.f9516o == null) {
                this.f9516o = new C2800d(this);
            }
            cVar = this.f9516o;
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0967k0 mo5578e() {
        return new C0967k0(this, new HashMap(0), new HashMap(0), "video", "private");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C4215c mo5579f(C0938d0 d0Var) {
        C1004u0 u0Var = new C1004u0(d0Var, new C2787a(3), "7516217ba2c1e38058d6713778b28334", "8a01d93f08ee4e98dffd04fd84d00711");
        C4215c.C4217b.C4218a a = C4215c.C4217b.m18575a(d0Var.f4093b);
        a.mo14408c(d0Var.f4094c);
        a.mo14407b(u0Var);
        return d0Var.f4092a.mo5440a(a.mo14406a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Map<Class<?>, List<Class<?>>> mo5586m() {
        HashMap hashMap = new HashMap();
        hashMap.put(C2799c.class, C2800d.m12635D());
        hashMap.put(C2788a.class, C2789b.m12594d());
        return hashMap;
    }
}
