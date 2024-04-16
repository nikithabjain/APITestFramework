package com.r3.Models;


import com.r3.Enums.Result;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Builder
@Getter
@Setter
public class USDRateResponse {
    Result result;
    String provider;
    String documentation;
    String terms_of_use;
    Long time_last_update_unix;
    String time_last_update_utc;
    Long time_next_update_unix;
    String time_next_update_utc;
    Long time_eol_unix;
    String base_code;
    Map<String, Double> rates;
}
