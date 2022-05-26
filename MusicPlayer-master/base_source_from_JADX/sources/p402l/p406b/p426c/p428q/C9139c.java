package p402l.p406b.p426c.p428q;

import java.io.UnsupportedEncodingException;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p402l.p406b.p407a.p416i.C9047a;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9122b;
import p402l.p406b.p426c.C9123c;
import p402l.p406b.p426c.C9128h;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.C9132l;
import p402l.p406b.p426c.C9135o;

/* renamed from: l.b.c.q.c */
/* compiled from: AsfTag */
public final class C9139c extends C9047a {

    /* renamed from: j */
    public static final Set<C9138b> f35762j;

    /* renamed from: k */
    private static final EnumMap<C9123c, C9138b> f35763k;

    /* renamed from: i */
    private final boolean f35764i;

    /* renamed from: l.b.c.q.c$a */
    /* compiled from: AsfTag */
    static /* synthetic */ class C9140a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35765a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                l.b.c.q.b[] r0 = p402l.p406b.p426c.p428q.C9138b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35765a = r0
                l.b.c.q.b r1 = p402l.p406b.p426c.p428q.C9138b.COVER_ART     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35765a     // Catch:{ NoSuchFieldError -> 0x001d }
                l.b.c.q.b r1 = p402l.p406b.p426c.p428q.C9138b.BANNER_IMAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p426c.p428q.C9139c.C9140a.<clinit>():void");
        }
    }

    /* renamed from: l.b.c.q.c$b */
    /* compiled from: AsfTag */
    private static class C9141b implements Iterator<C9144f> {

        /* renamed from: g */
        private final Iterator<C9132l> f35766g;

        public C9141b(Iterator<C9132l> it) {
            this.f35766g = it;
        }

        /* renamed from: a */
        public C9144f next() {
            return (C9144f) this.f35766g.next();
        }

        public boolean hasNext() {
            return this.f35766g.hasNext();
        }

        public void remove() {
            this.f35766g.remove();
        }
    }

    static {
        EnumMap<C9123c, C9138b> enumMap = new EnumMap<>(C9123c.class);
        f35763k = enumMap;
        enumMap.put(C9123c.ALBUM, C9138b.ALBUM);
        enumMap.put(C9123c.ALBUM_ARTIST, C9138b.ALBUM_ARTIST);
        enumMap.put(C9123c.ALBUM_ARTIST_SORT, C9138b.ALBUM_ARTIST_SORT);
        enumMap.put(C9123c.ALBUM_SORT, C9138b.ALBUM_SORT);
        enumMap.put(C9123c.AMAZON_ID, C9138b.AMAZON_ID);
        enumMap.put(C9123c.ARTIST, C9138b.AUTHOR);
        enumMap.put(C9123c.ARTIST_SORT, C9138b.ARTIST_SORT);
        enumMap.put(C9123c.ARTISTS, C9138b.ARTISTS);
        enumMap.put(C9123c.BARCODE, C9138b.BARCODE);
        enumMap.put(C9123c.BPM, C9138b.BPM);
        enumMap.put(C9123c.CATALOG_NO, C9138b.CATALOG_NO);
        enumMap.put(C9123c.COMMENT, C9138b.DESCRIPTION);
        enumMap.put(C9123c.COMPOSER, C9138b.COMPOSER);
        enumMap.put(C9123c.COMPOSER_SORT, C9138b.COMPOSER_SORT);
        enumMap.put(C9123c.CONDUCTOR, C9138b.CONDUCTOR);
        enumMap.put(C9123c.COVER_ART, C9138b.COVER_ART);
        enumMap.put(C9123c.CUSTOM1, C9138b.CUSTOM1);
        enumMap.put(C9123c.CUSTOM2, C9138b.CUSTOM2);
        enumMap.put(C9123c.CUSTOM3, C9138b.CUSTOM3);
        enumMap.put(C9123c.CUSTOM4, C9138b.CUSTOM4);
        enumMap.put(C9123c.CUSTOM5, C9138b.CUSTOM5);
        enumMap.put(C9123c.DISC_NO, C9138b.DISC_NO);
        enumMap.put(C9123c.DISC_SUBTITLE, C9138b.DISC_SUBTITLE);
        enumMap.put(C9123c.DISC_TOTAL, C9138b.DISC_TOTAL);
        enumMap.put(C9123c.ENCODER, C9138b.ENCODER);
        EnumMap<C9123c, C9138b> enumMap2 = f35763k;
        enumMap2.put(C9123c.FBPM, C9138b.FBPM);
        enumMap2.put(C9123c.GENRE, C9138b.GENRE);
        enumMap2.put(C9123c.GROUPING, C9138b.GROUPING);
        enumMap2.put(C9123c.ISRC, C9138b.ISRC);
        enumMap2.put(C9123c.IS_COMPILATION, C9138b.IS_COMPILATION);
        enumMap2.put(C9123c.KEY, C9138b.INITIAL_KEY);
        enumMap2.put(C9123c.LANGUAGE, C9138b.LANGUAGE);
        enumMap2.put(C9123c.LYRICIST, C9138b.LYRICIST);
        enumMap2.put(C9123c.LYRICS, C9138b.LYRICS);
        enumMap2.put(C9123c.MEDIA, C9138b.MEDIA);
        enumMap2.put(C9123c.MOOD, C9138b.MOOD);
        enumMap2.put(C9123c.MUSICBRAINZ_ARTISTID, C9138b.MUSICBRAINZ_ARTISTID);
        enumMap2.put(C9123c.MUSICBRAINZ_DISC_ID, C9138b.MUSICBRAINZ_DISC_ID);
        enumMap2.put(C9123c.MUSICBRAINZ_ORIGINAL_RELEASE_ID, C9138b.MUSICBRAINZ_ORIGINAL_RELEASEID);
        enumMap2.put(C9123c.MUSICBRAINZ_RELEASEARTISTID, C9138b.MUSICBRAINZ_RELEASEARTISTID);
        enumMap2.put(C9123c.MUSICBRAINZ_RELEASEID, C9138b.MUSICBRAINZ_RELEASEID);
        enumMap2.put(C9123c.MUSICBRAINZ_RELEASE_COUNTRY, C9138b.MUSICBRAINZ_RELEASE_COUNTRY);
        enumMap2.put(C9123c.MUSICBRAINZ_RELEASE_GROUP_ID, C9138b.MUSICBRAINZ_RELEASEGROUPID);
        enumMap2.put(C9123c.MUSICBRAINZ_RELEASE_TRACK_ID, C9138b.MUSICBRAINZ_RELEASETRACKID);
        enumMap2.put(C9123c.MUSICBRAINZ_RELEASE_STATUS, C9138b.MUSICBRAINZ_RELEASE_STATUS);
        enumMap2.put(C9123c.MUSICBRAINZ_RELEASE_TYPE, C9138b.MUSICBRAINZ_RELEASE_TYPE);
        enumMap2.put(C9123c.MUSICBRAINZ_TRACK_ID, C9138b.MUSICBRAINZ_TRACK_ID);
        enumMap2.put(C9123c.MUSICBRAINZ_WORK_ID, C9138b.MUSICBRAINZ_WORKID);
        enumMap2.put(C9123c.MUSICIP_ID, C9138b.MUSICIP_ID);
        enumMap2.put(C9123c.OCCASION, C9138b.OCCASION);
        EnumMap<C9123c, C9138b> enumMap3 = f35763k;
        enumMap3.put(C9123c.ORIGINAL_ARTIST, C9138b.ORIGINAL_ARTIST);
        enumMap3.put(C9123c.ORIGINAL_ALBUM, C9138b.ORIGINAL_ALBUM);
        enumMap3.put(C9123c.ORIGINAL_LYRICIST, C9138b.ORIGINAL_LYRICIST);
        enumMap3.put(C9123c.ORIGINAL_YEAR, C9138b.ORIGINAL_YEAR);
        enumMap3.put(C9123c.RATING, C9138b.USER_RATING);
        enumMap3.put(C9123c.RECORD_LABEL, C9138b.RECORD_LABEL);
        enumMap3.put(C9123c.QUALITY, C9138b.QUALITY);
        enumMap3.put(C9123c.REMIXER, C9138b.REMIXER);
        enumMap3.put(C9123c.SCRIPT, C9138b.SCRIPT);
        enumMap3.put(C9123c.SUBTITLE, C9138b.SUBTITLE);
        enumMap3.put(C9123c.TAGS, C9138b.TAGS);
        enumMap3.put(C9123c.TEMPO, C9138b.TEMPO);
        C9123c cVar = C9123c.TITLE;
        C9138b bVar = C9138b.TITLE;
        enumMap3.put(cVar, bVar);
        enumMap3.put(C9123c.TITLE_SORT, C9138b.TITLE_SORT);
        C9123c cVar2 = C9123c.TRACK;
        C9138b bVar2 = C9138b.TRACK;
        enumMap3.put(cVar2, bVar2);
        enumMap3.put(C9123c.TRACK_TOTAL, C9138b.TRACK_TOTAL);
        enumMap3.put(C9123c.URL_DISCOGS_ARTIST_SITE, C9138b.URL_DISCOGS_ARTIST_SITE);
        enumMap3.put(C9123c.URL_DISCOGS_RELEASE_SITE, C9138b.URL_DISCOGS_RELEASE_SITE);
        enumMap3.put(C9123c.URL_LYRICS_SITE, C9138b.URL_LYRICS_SITE);
        enumMap3.put(C9123c.URL_OFFICIAL_ARTIST_SITE, C9138b.URL_OFFICIAL_ARTIST_SITE);
        enumMap3.put(C9123c.URL_OFFICIAL_RELEASE_SITE, C9138b.URL_OFFICIAL_RELEASE_SITE);
        enumMap3.put(C9123c.URL_WIKIPEDIA_ARTIST_SITE, C9138b.URL_WIKIPEDIA_ARTIST_SITE);
        enumMap3.put(C9123c.URL_WIKIPEDIA_RELEASE_SITE, C9138b.URL_WIKIPEDIA_RELEASE_SITE);
        C9123c cVar3 = C9123c.YEAR;
        C9138b bVar3 = C9138b.YEAR;
        enumMap3.put(cVar3, bVar3);
        enumMap3.put(C9123c.ENGINEER, C9138b.ENGINEER);
        EnumMap<C9123c, C9138b> enumMap4 = f35763k;
        enumMap4.put(C9123c.PRODUCER, C9138b.PRODUCER);
        enumMap4.put(C9123c.DJMIXER, C9138b.DJMIXER);
        enumMap4.put(C9123c.MIXER, C9138b.MIXER);
        enumMap4.put(C9123c.ARRANGER, C9138b.ARRANGER);
        enumMap4.put(C9123c.ACOUSTID_FINGERPRINT, C9138b.ACOUSTID_FINGERPRINT);
        enumMap4.put(C9123c.ACOUSTID_ID, C9138b.ACOUSTID_ID);
        enumMap4.put(C9123c.COUNTRY, C9138b.COUNTRY);
        HashSet hashSet = new HashSet();
        f35762j = hashSet;
        hashSet.add(C9138b.ALBUM);
        hashSet.add(C9138b.AUTHOR);
        hashSet.add(C9138b.DESCRIPTION);
        hashSet.add(C9138b.GENRE);
        hashSet.add(bVar);
        hashSet.add(bVar2);
        hashSet.add(bVar3);
    }

    public C9139c() {
        this(false);
    }

    /* renamed from: l */
    private C9132l m48601l(C9132l lVar) {
        C9132l lVar2;
        if (!mo31767q()) {
            return lVar;
        }
        if (lVar instanceof C9144f) {
            try {
                lVar2 = (C9132l) ((C9144f) lVar).clone();
            } catch (CloneNotSupportedException unused) {
                lVar2 = new C9144f(((C9144f) lVar).mo31772a());
            }
            return lVar2;
        } else if (lVar instanceof C9135o) {
            return new C9145g(lVar.mo31497D(), ((C9135o) lVar).getContent());
        } else {
            throw new RuntimeException("Unknown Asf Tag Field class:" + lVar.getClass());
        }
    }

    /* renamed from: m */
    private void m48602m(C9130j jVar) {
        Iterator<C9132l> d = jVar.mo31520d();
        while (d.hasNext()) {
            C9132l l = m48601l(d.next());
            if (l != null) {
                super.mo31522f(l);
            }
        }
    }

    /* renamed from: r */
    private boolean m48603r(C9132l lVar) {
        if (lVar != null && (lVar instanceof C9144f)) {
            return !lVar.isEmpty();
        }
        return false;
    }

    /* renamed from: a */
    public List<C9132l> mo31559a(C9123c cVar) throws C9128h {
        if (cVar != null) {
            return super.mo31525i(f35763k.get(cVar).getFieldName());
        }
        throw new C9128h();
    }

    /* renamed from: f */
    public void mo31522f(C9132l lVar) {
        if (!m48603r(lVar)) {
            return;
        }
        if (C9138b.isMultiValued(lVar.mo31497D())) {
            super.mo31522f(m48601l(lVar));
        } else {
            super.mo31528k(m48601l(lVar));
        }
    }

    /* renamed from: k */
    public void mo31528k(C9132l lVar) {
        if (m48603r(lVar)) {
            super.mo31528k(m48601l(lVar));
        }
    }

    /* renamed from: n */
    public C9145g mo31523g(C9123c cVar, String str) throws C9128h, C9122b {
        if (str == null) {
            throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
        } else if (cVar != null) {
            C9138b bVar = f35763k.get(cVar);
            if (bVar != null) {
                return mo31765o(bVar, str);
            }
            throw new C9128h(cVar.toString());
        } else {
            throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
        }
    }

    /* renamed from: o */
    public C9145g mo31765o(C9138b bVar, String str) {
        if (str == null) {
            throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
        } else if (bVar != null) {
            int i = C9140a.f35765a[bVar.ordinal()];
            if (i == 1) {
                throw new UnsupportedOperationException("Cover Art cannot be created using this method");
            } else if (i != 2) {
                return new C9145g(bVar.getFieldName(), str);
            } else {
                throw new UnsupportedOperationException("Banner Image cannot be created using this method");
            }
        } else {
            throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
        }
    }

    /* renamed from: p */
    public Iterator<C9144f> mo31766p() {
        if (mo31767q()) {
            return new C9141b(mo31520d());
        }
        throw new IllegalStateException("Since the field conversion is not enabled, this method cannot be executed");
    }

    /* renamed from: q */
    public boolean mo31767q() {
        return this.f35764i;
    }

    public C9139c(boolean z) {
        this.f35764i = z;
    }

    public C9139c(C9130j jVar, boolean z) throws UnsupportedEncodingException {
        this(z);
        m48602m(jVar);
    }
}
