package p402l.p406b.p426c.p431t;

/* renamed from: l.b.c.t.d0 */
/* compiled from: ID3v24FieldKey */
public enum C9183d0 {
    ALBUM("TALB", r7),
    ALBUM_ARTIST("TPE2", r7),
    ALBUM_ARTIST_SORT("TSO2", r7),
    ALBUM_SORT("TSOA", r7),
    AMAZON_ID("TXXX", "ASIN", r6),
    ARTIST("TPE1", r7),
    ARTIST_SORT("TSOP", r7),
    BARCODE("TXXX", "BARCODE", r6),
    BPM("TBPM", r7),
    CATALOG_NO("TXXX", "CATALOGNUMBER", r6),
    COMMENT("COMM", r7),
    COMPOSER("TCOM", r7),
    COMPOSER_SORT("TSOC", r7),
    CONDUCTOR("TPE3", r7),
    COVER_ART("APIC", C9195i0.BINARY),
    CUSTOM1("COMM", "Songs-DB_Custom1", r6),
    CUSTOM2("COMM", "Songs-DB_Custom2", r6),
    CUSTOM3("COMM", "Songs-DB_Custom3", r6),
    CUSTOM4("COMM", "Songs-DB_Custom4", r6),
    CUSTOM5("COMM", "Songs-DB_Custom5", r6),
    DISC_NO("TPOS", r7),
    DISC_SUBTITLE("TSST", r7),
    DISC_TOTAL("TPOS", r7),
    ENCODER("TENC", r7),
    FBPM("TXXX", "FBPM", r7),
    GENRE("TCON", r7),
    GROUPING("TIT1", r7),
    ISRC("TSRC", r7),
    IS_COMPILATION("TCMP", r7),
    KEY("TKEY", r7),
    LANGUAGE("TLAN", r7),
    LYRICIST("TEXT", r7),
    LYRICS("USLT", r7),
    MEDIA("TMED", r7),
    MOOD("TMOO", r7),
    MUSICBRAINZ_ARTISTID("TXXX", "MusicBrainz Artist Id", r6),
    MUSICBRAINZ_DISC_ID("TXXX", "MusicBrainz Disc Id", r6),
    MUSICBRAINZ_ORIGINAL_RELEASEID("TXXX", "MusicBrainz Original Album Id", r6),
    MUSICBRAINZ_RELEASEARTISTID("TXXX", "MusicBrainz Album Artist Id", r6),
    MUSICBRAINZ_RELEASEID("TXXX", "MusicBrainz Album Id", r6),
    MUSICBRAINZ_RELEASE_COUNTRY("TXXX", "MusicBrainz Album Release Country", r6),
    MUSICBRAINZ_RELEASE_GROUP_ID("TXXX", "MusicBrainz Release Group Id", r6),
    MUSICBRAINZ_RELEASE_TRACK_ID("TXXX", "MusicBrainz Release Track Id", r6),
    MUSICBRAINZ_RELEASE_STATUS("TXXX", "MusicBrainz Album Status", r6),
    MUSICBRAINZ_RELEASE_TYPE("TXXX", "MusicBrainz Album Type", r6),
    MUSICBRAINZ_TRACK_ID("UFID", "http://musicbrainz.org", r6),
    MUSICBRAINZ_WORK_ID("TXXX", "MusicBrainz Work Id", r6),
    MUSICIP_ID("TXXX", "MusicIP PUID", r6),
    OCCASION("COMM", "Songs-DB_Occasion", r6),
    ORIGINAL_ALBUM("TOAL", r7),
    ORIGINAL_ARTIST("TOPE", r7),
    ORIGINAL_LYRICIST("TOLY", r7),
    ORIGINAL_YEAR("TDOR", r7),
    QUALITY("COMM", "Songs-DB_Preference", r6),
    RATING("POPM", r7),
    RECORD_LABEL("TPUB", r7),
    REMIXER("TPE4", r7),
    SCRIPT("TXXX", "Script", r6),
    SUBTITLE("TIT3", r7),
    TAGS("TXXX", "TAGS", r6),
    TEMPO("COMM", "Songs-DB_Tempo", r6),
    TITLE("TIT2", r7),
    TITLE_SORT("TSOT", r7),
    TRACK("TRCK", r7),
    TRACK_TOTAL("TRCK", r7),
    URL_DISCOGS_ARTIST_SITE("WXXX", "DISCOGS_ARTIST", r6),
    URL_DISCOGS_RELEASE_SITE("WXXX", "DISCOGS_RELEASE", r6),
    URL_LYRICS_SITE("WXXX", "LYRICS_SITE", r6),
    URL_OFFICIAL_ARTIST_SITE("WOAR", r7),
    URL_OFFICIAL_RELEASE_SITE("WXXX", "OFFICIAL_RELEASE", r6),
    URL_WIKIPEDIA_ARTIST_SITE("WXXX", "WIKIPEDIA_ARTIST", r6),
    URL_WIKIPEDIA_RELEASE_SITE("WXXX", "WIKIPEDIA_RELEASE", r6),
    YEAR("TDRC", r7),
    ENGINEER("TIPL", "engineer", r6),
    PRODUCER("TIPL", "producer", r6),
    MIXER("TIPL", "mix", r6),
    DJMIXER("TIPL", "DJ-mix", r6),
    ARRANGER("TIPL", "arranger", r6),
    ARTISTS("TXXX", "ARTISTS", r6),
    ACOUSTID_FINGERPRINT("TXXX", "Acoustid Fingerprint", r6),
    ACOUSTID_ID("TXXX", "Acoustid Id", r6),
    COUNTRY("TXXX", "Country", r6);
    
    private String fieldName;
    private C9195i0 fieldType;
    private String frameId;
    private String subId;

    private C9183d0(String str, C9195i0 i0Var) {
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

    private C9183d0(String str, String str2, C9195i0 i0Var) {
        this.frameId = str;
        this.subId = str2;
        this.fieldType = i0Var;
        this.fieldName = str + ":" + str2;
    }
}
