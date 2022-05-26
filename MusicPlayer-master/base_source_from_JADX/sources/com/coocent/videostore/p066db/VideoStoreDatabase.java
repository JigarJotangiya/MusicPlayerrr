package com.coocent.videostore.p066db;

import android.content.Context;
import androidx.room.C0992r0;
import androidx.room.C0994s0;
import androidx.room.p005c1.C0936a;
import p082e.p149u.p150a.C4214b;
import p159f.p166c.p231p.p235d.C4819b;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;

/* renamed from: com.coocent.videostore.db.VideoStoreDatabase */
/* compiled from: VideoStoreDatabase.kt */
public abstract class VideoStoreDatabase extends C0994s0 {

    /* renamed from: n */
    public static final C2782a f9515n = new C2782a((C8589g) null);

    /* renamed from: com.coocent.videostore.db.VideoStoreDatabase$a */
    /* compiled from: VideoStoreDatabase.kt */
    public static final class C2782a extends C4819b<VideoStoreDatabase, Context> {

        /* renamed from: com.coocent.videostore.db.VideoStoreDatabase$a$a */
        /* compiled from: VideoStoreDatabase.kt */
        static final class C2783a extends C8595m implements C8570l<Context, VideoStoreDatabase> {
            public static final C2783a INSTANCE = new C2783a();

            /* renamed from: com.coocent.videostore.db.VideoStoreDatabase$a$a$a */
            /* compiled from: VideoStoreDatabase.kt */
            public static final class C2784a extends C0936a {
                C2784a() {
                    super(1, 2);
                }

                /* renamed from: a */
                public void mo5455a(C4214b bVar) {
                    C8594l.m46771e(bVar, "database");
                    bVar.mo5543q("ALTER TABLE video ADD COLUMN last_playback_time INTEGER NOT NULL DEFAULT 0 ");
                    bVar.mo5543q("ALTER TABLE video ADD COLUMN last_copy_folder_uri TEXT");
                    bVar.mo5543q("ALTER TABLE video ADD COLUMN last_copy_folder_path TEXT");
                    bVar.mo5543q("ALTER TABLE video ADD COLUMN last_display_name TEXT");
                    bVar.mo5543q("ALTER TABLE video ADD COLUMN is_private_video INTEGER");
                    bVar.mo5543q("CREATE TABLE IF NOT EXISTS `private` (`video_id` INTEGER NOT NULL, `uri` TEXT, `path` TEXT, `display_name` TEXT, `title` TEXT, `extension` TEXT, `size` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `mime_type` TEXT, `date_taken` INTEGER NOT NULL, `date_modified` INTEGER NOT NULL, `folder_name` TEXT, `folder_path` TEXT, `thumbnail` TEXT, `recent_added` INTEGER NOT NULL, `last_watch_time` INTEGER NOT NULL, `video_count` INTEGER NOT NULL, `video_recent_added_count` INTEGER NOT NULL,`last_playback_time` INTEGER NOT NULL,`last_copy_folder_uri` TEXT, `last_copy_folder_path` TEXT,`last_display_name` TEXT,`is_private_video` INTEGER, PRIMARY KEY(`video_id`))");
                }
            }

            /* renamed from: com.coocent.videostore.db.VideoStoreDatabase$a$a$b */
            /* compiled from: VideoStoreDatabase.kt */
            public static final class C2785b extends C0936a {
                C2785b() {
                    super(2, 3);
                }

                /* renamed from: a */
                public void mo5455a(C4214b bVar) {
                    C8594l.m46771e(bVar, "database");
                }
            }

            /* renamed from: com.coocent.videostore.db.VideoStoreDatabase$a$a$c */
            /* compiled from: VideoStoreDatabase.kt */
            public static final class C2786c extends C0936a {
                C2786c() {
                    super(3, 4);
                }

                /* renamed from: a */
                public void mo5455a(C4214b bVar) {
                    C8594l.m46771e(bVar, "database");
                }
            }

            C2783a() {
                super(1);
            }

            public final VideoStoreDatabase invoke(Context context) {
                C8594l.m46771e(context, "it");
                C0994s0.C0995a<VideoStoreDatabase> a = C0992r0.m5827a(context.getApplicationContext(), VideoStoreDatabase.class, "VideoStore");
                a.mo5596b(new C2784a());
                a.mo5596b(new C2785b());
                a.mo5596b(new C2786c());
                a.mo5599e();
                VideoStoreDatabase d = a.mo5598d();
                C8594l.m46770d(d, "databaseBuilder(it.appli…uctiveMigration().build()");
                return d;
            }
        }

        private C2782a() {
            super(C2783a.INSTANCE);
        }

        public /* synthetic */ C2782a(C8589g gVar) {
            this();
        }
    }

    /* renamed from: E */
    public abstract C2788a mo10389E();

    /* renamed from: F */
    public abstract C2799c mo10390F();
}
