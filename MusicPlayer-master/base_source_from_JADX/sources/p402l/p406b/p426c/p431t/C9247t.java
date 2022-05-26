package p402l.p406b.p426c.p431t;

/* renamed from: l.b.c.t.t */
/* compiled from: ID3v22FieldKey */
public enum C9247t {
    ALBUM("TAL", r7),
    ALBUM_ARTIST("TP2", r7),
    ALBUM_ARTIST_SORT("TS2", r7),
    ALBUM_SORT("TSA", r7),
    AMAZON_ID("TXX", "ASIN", r6),
    ARTIST("TP1", r7),
    ARTIST_SORT("TSP", r7),
    BARCODE("TXX", "BARCODE", r6),
    BPM("TBP", r7),
    CATALOG_NO("TXX", "CATALOGNUMBER", r6),
    COMMENT("COM", r7),
    COMPOSER("TCM", r7),
    COMPOSER_SORT("TSC", r7),
    CONDUCTOR("TPE", r7),
    COVER_ART("PIC", C9195i0.BINARY),
    CUSTOM1("COM", "Songs-DB_Custom1", r6),
    CUSTOM2("COM", "Songs-DB_Custom2", r6),
    CUSTOM3("COM", "Songs-DB_Custom3", r6),
    CUSTOM4("COM", "Songs-DB_Custom4", r6),
    CUSTOM5("COM", "Songs-DB_Custom5", r6),
    DISC_NO("TPA", r7),
    DISC_SUBTITLE("TPS", r7),
    DISC_TOTAL("TPA", r7),
    ENCODER("TEN", r7),
    FBPM("TXX", "FBPM", r7),
    GENRE("TCO", r7),
    GROUPING("TT1", r7),
    ISRC("TRC", r7),
    IS_COMPILATION("TCP", r7),
    KEY("TKE", r7),
    LANGUAGE("TLA", r7),
    LYRICIST("TXT", r7),
    LYRICS("ULT", r7),
    MEDIA("TMT", r7),
    MOOD("TXX", "MOOD", r6),
    MUSICBRAINZ_ARTISTID("TXX", "MusicBrainz Artist Id", r6),
    MUSICBRAINZ_DISC_ID("TXX", "MusicBrainz Disc Id", r6),
    MUSICBRAINZ_ORIGINAL_RELEASEID("TXX", "MusicBrainz Original Album Id", r6),
    MUSICBRAINZ_RELEASEARTISTID("TXX", "MusicBrainz Album Artist Id", r6),
    MUSICBRAINZ_RELEASEID("TXX", "MusicBrainz Album Id", r6),
    MUSICBRAINZ_RELEASE_COUNTRY("TXX", "MusicBrainz Album Release Country", r6),
    MUSICBRAINZ_RELEASE_GROUP_ID("TXX", "MusicBrainz Release Group Id", r6),
    MUSICBRAINZ_RELEASE_TRACK_ID("TXX", "MusicBrainz Release Track Id", r6),
    MUSICBRAINZ_RELEASE_STATUS("TXX", "MusicBrainz Album Status", r6),
    MUSICBRAINZ_RELEASE_TYPE("TXX", "MusicBrainz Album Type", r6),
    MUSICBRAINZ_TRACK_ID("UFI", "http://musicbrainz.org", r6),
    MUSICBRAINZ_WORK_ID("TXX", "MusicBrainz Work Id", r6),
    MUSICIP_ID("TXX", "MusicIP PUID", r6),
    OCCASION("COM", "Songs-DB_Occasion", r6),
    ORIGINAL_ALBUM("TOT", r7),
    ORIGINAL_ARTIST("TOA", r7),
    ORIGINAL_LYRICIST("TOL", r7),
    ORIGINAL_YEAR("TOR", r7),
    QUALITY("COM", "Songs-DB_Preference", r6),
    RATING("POP", r7),
    RECORD_LABEL("TPB", r7),
    REMIXER("TP4", r7),
    SCRIPT("TXX", "Script", r6),
    SUBTITLE("TT3", r7),
    TAGS("TXX", "TAGS", r6),
    TEMPO("COM", "Songs-DB_Tempo", r6),
    TITLE("TT2", r7),
    TITLE_SORT("TST", r7),
    TRACK("TRK", r7),
    TRACK_TOTAL("TRK", r7),
    URL_DISCOGS_ARTIST_SITE("WXX", "DISCOGS_ARTIST", r6),
    URL_DISCOGS_RELEASE_SITE("WXX", "DISCOGS_RELEASE", r6),
    URL_LYRICS_SITE("WXX", "LYRICS_SITE", r6),
    URL_OFFICIAL_ARTIST_SITE("WAR", r7),
    URL_OFFICIAL_RELEASE_SITE("WXX", "OFFICIAL_RELEASE", r6),
    URL_WIKIPEDIA_ARTIST_SITE("WXX", "WIKIPEDIA_ARTIST", r6),
    URL_WIKIPEDIA_RELEASE_SITE("WXX", "WIKIPEDIA_RELEASE", r6),
    YEAR("TYE", r7),
    ENGINEER("IPL", "engineer", r6),
    PRODUCER("IPL", "producer", r6),
    MIXER("IPL", "mix", r6),
    DJMIXER("IPL", "DJ-mix", r6),
    ARRANGER("IPL", "arranger", r6),
    ARTISTS("TXX", "ARTISTS", r6),
    ACOUSTID_FINGERPRINT("TXX", "Acoustid Fingerprint", r6),
    ACOUSTID_ID("TXX", "Acoustid Id", r6),
    COUNTRY("TXX", "Country", r6);
    
    private String fieldName;
    private C9195i0 fieldType;
    private String frameId;
    private String subId;

    private C9247t(String str, C9195i0 i0Var) {
        this.frameId = str;
        this.fieldType = i0Var;
        this.fieldName = str;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public C9195i0 getFieldType() {
        return this.fieldType;
    }

    public String getFrameId() {
        return this.frameId;
    }

    public String getSubId() {
        return this.subId;
    }

    private C9247t(String str, String str2, C9195i0 i0Var) {
        this.frameId = str;
        this.subId = str2;
        this.fieldType = i0Var;
        this.fieldName = str + ":" + str2;
    }
}
