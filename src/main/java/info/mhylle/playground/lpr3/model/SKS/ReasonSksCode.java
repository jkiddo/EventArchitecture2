package info.mhylle.playground.lpr3.model.SKS;

/**
 * Created by mnh on 25-01-2017.
 */
public enum ReasonSksCode {
    HEAD_AND_CANCER_PACKAGE_START("AFB02A"),
    HEAD_AND_CANCER_ELUCIDATION("AFB02B"),
    HEAD_AND_CANCER_DECISION("AFB02C"),
    HEAD_AND_CANCER_INITIAL_TREATMENT_START("AFB02F"),
    HEAD_AND_CANCER_FOLLOWUP("AFB02P"),
    HEAD_AND_CANCER_END("AFB02X"),
    PANCREAS_CANCER_PACKAGE_START("AFB07A"),
    PANCREAS_CANCER_ELUCIDATION("AFB07B"),
    PANCREAS_CANCER_DECISION("AFB07C"),
    PANCREAS_CANCER_INITIAL_TREATMENT_START("AFB07F"),
    PANCREAS_CANCER_FOLLOWUP("AFB07P"),
    PANCREAS_CANCER_END("AFB07X");

    private String code;

    ReasonSksCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}