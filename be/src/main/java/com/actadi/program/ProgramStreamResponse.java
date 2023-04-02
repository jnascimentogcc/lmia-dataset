package com.actadi.program;

import com.actadi.common.ResponseRoot;

import java.util.ArrayList;
import java.util.List;

public class ProgramStreamResponse extends ResponseRoot {

    private List<ProgramStreamDTO> programs = new ArrayList<>();

    public List<ProgramStreamDTO> getPrograms() {
        return programs;
    }

    public void setPrograms(List<ProgramStreamDTO> programs) {
        this.programs = programs;
    }
}
