package com.netzme.netzme.dtos.responses;

import com.netzme.netzme.dtos.models.InfoModel;
import com.netzme.netzme.dtos.models.Result;
import lombok.Data;

import java.util.List;

@Data
public class ApiResponse {
    private List<Result> results;
    private InfoModel info;
}
