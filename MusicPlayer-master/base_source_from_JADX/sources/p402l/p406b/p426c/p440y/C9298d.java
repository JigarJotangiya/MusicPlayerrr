package p402l.p406b.p426c.p440y;

import java.util.EnumMap;
import java.util.List;
import p402l.p406b.p407a.p416i.C9047a;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9122b;
import p402l.p406b.p426c.C9123c;
import p402l.p406b.p426c.C9128h;
import p402l.p406b.p426c.C9132l;

/* renamed from: l.b.c.y.d */
/* compiled from: VorbisCommentTag */
public class C9298d extends C9047a {

    /* renamed from: i */
    private static EnumMap<C9123c, C9296b> f36010i;

    static {
        EnumMap<C9123c, C9296b> enumMap = new EnumMap<>(C9123c.class);
        f36010i = enumMap;
        enumMap.put(C9123c.ALBUM, C9296b.ALBUM);
        f36010i.put(C9123c.ALBUM_ARTIST, C9296b.ALBUMARTIST);
        f36010i.put(C9123c.ALBUM_ARTIST_SORT, C9296b.ALBUMARTISTSORT);
        f36010i.put(C9123c.ALBUM_SORT, C9296b.ALBUMSORT);
        f36010i.put(C9123c.ARTIST, C9296b.ARTIST);
        f36010i.put(C9123c.ARTISTS, C9296b.ARTISTS);
        f36010i.put(C9123c.AMAZON_ID, C9296b.ASIN);
        f36010i.put(C9123c.ARTIST_SORT, C9296b.ARTISTSORT);
        f36010i.put(C9123c.BARCODE, C9296b.BARCODE);
        f36010i.put(C9123c.BPM, C9296b.BPM);
        f36010i.put(C9123c.CATALOG_NO, C9296b.CATALOGNUMBER);
        f36010i.put(C9123c.COMMENT, C9296b.COMMENT);
        f36010i.put(C9123c.COMPOSER, C9296b.COMPOSER);
        f36010i.put(C9123c.COMPOSER_SORT, C9296b.COMPOSERSORT);
        f36010i.put(C9123c.CONDUCTOR, C9296b.CONDUCTOR);
        f36010i.put(C9123c.COVER_ART, C9296b.METADATA_BLOCK_PICTURE);
        f36010i.put(C9123c.CUSTOM1, C9296b.CUSTOM1);
        f36010i.put(C9123c.CUSTOM2, C9296b.CUSTOM2);
        f36010i.put(C9123c.CUSTOM3, C9296b.CUSTOM3);
        f36010i.put(C9123c.CUSTOM4, C9296b.CUSTOM4);
        f36010i.put(C9123c.CUSTOM5, C9296b.CUSTOM5);
        f36010i.put(C9123c.DISC_NO, C9296b.DISCNUMBER);
        f36010i.put(C9123c.DISC_SUBTITLE, C9296b.DISCSUBTITLE);
        f36010i.put(C9123c.DISC_TOTAL, C9296b.DISCTOTAL);
        f36010i.put(C9123c.ENCODER, C9296b.VENDOR);
        f36010i.put(C9123c.FBPM, C9296b.FBPM);
        f36010i.put(C9123c.GENRE, C9296b.GENRE);
        f36010i.put(C9123c.GROUPING, C9296b.GROUPING);
        f36010i.put(C9123c.ISRC, C9296b.ISRC);
        f36010i.put(C9123c.IS_COMPILATION, C9296b.COMPILATION);
        f36010i.put(C9123c.KEY, C9296b.KEY);
        f36010i.put(C9123c.LANGUAGE, C9296b.LANGUAGE);
        f36010i.put(C9123c.LYRICIST, C9296b.LYRICIST);
        f36010i.put(C9123c.LYRICS, C9296b.LYRICS);
        f36010i.put(C9123c.MEDIA, C9296b.MEDIA);
        f36010i.put(C9123c.MOOD, C9296b.MOOD);
        f36010i.put(C9123c.MUSICBRAINZ_ARTISTID, C9296b.MUSICBRAINZ_ARTISTID);
        f36010i.put(C9123c.MUSICBRAINZ_DISC_ID, C9296b.MUSICBRAINZ_DISCID);
        f36010i.put(C9123c.MUSICBRAINZ_RELEASEARTISTID, C9296b.MUSICBRAINZ_ALBUMARTISTID);
        f36010i.put(C9123c.MUSICBRAINZ_ORIGINAL_RELEASE_ID, C9296b.MUSICBRAINZ_ORIGINAL_ALBUMID);
        f36010i.put(C9123c.MUSICBRAINZ_RELEASEID, C9296b.MUSICBRAINZ_ALBUMID);
        f36010i.put(C9123c.MUSICBRAINZ_RELEASE_GROUP_ID, C9296b.MUSICBRAINZ_RELEASEGROUPID);
        f36010i.put(C9123c.MUSICBRAINZ_RELEASE_COUNTRY, C9296b.RELEASECOUNTRY);
        f36010i.put(C9123c.MUSICBRAINZ_RELEASE_STATUS, C9296b.MUSICBRAINZ_ALBUMSTATUS);
        f36010i.put(C9123c.MUSICBRAINZ_RELEASE_TRACK_ID, C9296b.MUSICBRAINZ_RELEASETRACKID);
        f36010i.put(C9123c.MUSICBRAINZ_RELEASE_TYPE, C9296b.MUSICBRAINZ_ALBUMTYPE);
        f36010i.put(C9123c.MUSICBRAINZ_TRACK_ID, C9296b.MUSICBRAINZ_TRACKID);
        f36010i.put(C9123c.MUSICBRAINZ_WORK_ID, C9296b.MUSICBRAINZ_WORKID);
        f36010i.put(C9123c.OCCASION, C9296b.OCCASION);
        f36010i.put(C9123c.ORIGINAL_ALBUM, C9296b.ORIGINAL_ALBUM);
        f36010i.put(C9123c.ORIGINAL_ARTIST, C9296b.ORIGINAL_ARTIST);
        f36010i.put(C9123c.ORIGINAL_LYRICIST, C9296b.ORIGINAL_LYRICIST);
        f36010i.put(C9123c.ORIGINAL_YEAR, C9296b.ORIGINAL_YEAR);
        f36010i.put(C9123c.MUSICIP_ID, C9296b.MUSICIP_PUID);
        f36010i.put(C9123c.QUALITY, C9296b.QUALITY);
        f36010i.put(C9123c.RATING, C9296b.RATING);
        f36010i.put(C9123c.RECORD_LABEL, C9296b.LABEL);
        f36010i.put(C9123c.REMIXER, C9296b.REMIXER);
        f36010i.put(C9123c.TAGS, C9296b.TAGS);
        f36010i.put(C9123c.SCRIPT, C9296b.SCRIPT);
        f36010i.put(C9123c.SUBTITLE, C9296b.SUBTITLE);
        f36010i.put(C9123c.TEMPO, C9296b.TEMPO);
        f36010i.put(C9123c.TITLE, C9296b.TITLE);
        f36010i.put(C9123c.TITLE_SORT, C9296b.TITLESORT);
        f36010i.put(C9123c.TRACK, C9296b.TRACKNUMBER);
        f36010i.put(C9123c.TRACK_TOTAL, C9296b.TRACKTOTAL);
        f36010i.put(C9123c.URL_DISCOGS_ARTIST_SITE, C9296b.URL_DISCOGS_ARTIST_SITE);
        f36010i.put(C9123c.URL_DISCOGS_RELEASE_SITE, C9296b.URL_DISCOGS_RELEASE_SITE);
        f36010i.put(C9123c.URL_LYRICS_SITE, C9296b.URL_LYRICS_SITE);
        f36010i.put(C9123c.URL_OFFICIAL_ARTIST_SITE, C9296b.URL_OFFICIAL_ARTIST_SITE);
        f36010i.put(C9123c.URL_OFFICIAL_RELEASE_SITE, C9296b.URL_OFFICIAL_RELEASE_SITE);
        f36010i.put(C9123c.URL_WIKIPEDIA_ARTIST_SITE, C9296b.URL_WIKIPEDIA_ARTIST_SITE);
        f36010i.put(C9123c.URL_WIKIPEDIA_RELEASE_SITE, C9296b.URL_WIKIPEDIA_RELEASE_SITE);
        f36010i.put(C9123c.YEAR, C9296b.DATE);
        f36010i.put(C9123c.ENGINEER, C9296b.ENGINEER);
        f36010i.put(C9123c.PRODUCER, C9296b.PRODUCER);
        f36010i.put(C9123c.DJMIXER, C9296b.DJMIXER);
        f36010i.put(C9123c.MIXER, C9296b.MIXER);
        f36010i.put(C9123c.ARRANGER, C9296b.ARRANGER);
        f36010i.put(C9123c.ACOUSTID_FINGERPRINT, C9296b.ACOUSTID_FINGERPRINT);
        f36010i.put(C9123c.ACOUSTID_ID, C9296b.ACOUSTID_ID);
        f36010i.put(C9123c.COUNTRY, C9296b.COUNTRY);
    }

    C9298d() {
    }

    /* renamed from: m */
    public static C9298d m49285m() {
        C9298d dVar = new C9298d();
        dVar.mo32145o("jaudiotagger");
        return dVar;
    }

    /* renamed from: a */
    public List<C9132l> mo31559a(C9123c cVar) throws C9128h {
        C9296b bVar = f36010i.get(cVar);
        if (bVar != null) {
            return super.mo31525i(bVar.getFieldName());
        }
        throw new C9128h();
    }

    /* renamed from: f */
    public void mo31522f(C9132l lVar) {
        if (lVar.mo31497D().equals(C9296b.VENDOR.getFieldName())) {
            super.mo31528k(lVar);
        } else {
            super.mo31522f(lVar);
        }
    }

    /* renamed from: g */
    public C9132l mo31523g(C9123c cVar, String str) throws C9128h, C9122b {
        if (cVar != null) {
            return mo32143l(f36010i.get(cVar), str);
        }
        throw new C9128h();
    }

    public boolean isEmpty() {
        return this.f35526h.size() <= 1;
    }

    /* renamed from: l */
    public C9132l mo32143l(C9296b bVar, String str) throws C9128h, C9122b {
        if (str == null) {
            throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
        } else if (bVar != null) {
            return new C9299e(bVar.getFieldName(), str);
        } else {
            throw new C9128h();
        }
    }

    /* renamed from: n */
    public String mo32144n() {
        return mo31527j(C9296b.VENDOR.getFieldName());
    }

    /* renamed from: o */
    public void mo32145o(String str) {
        if (str == null) {
            str = "jaudiotagger";
        }
        super.mo31528k(new C9299e(C9296b.VENDOR.getFieldName(), str));
    }

    public String toString() {
        return "OGG " + super.toString();
    }
}
