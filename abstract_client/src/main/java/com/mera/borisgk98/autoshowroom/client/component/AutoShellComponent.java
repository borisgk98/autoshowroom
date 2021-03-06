package com.mera.borisgk98.autoshowroom.client.component;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.model.*;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.table.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@ShellComponent
public class AutoShellComponent extends AbstractShellComponent<Auto> implements ReadDeleteShellComponent<Auto> {

    public AutoShellComponent() {
        super(Auto.class);
    }

    @ShellMethod(
            prefix = "--",
            value = "Create new auto",
            key = "auto create"
    )
    public String create(
			@ShellOption Integer markId,
			@ShellOption Integer modelId,
            @ShellOption Integer[] optionIds) {
        Auto auto = new Auto();
        AutoMark automark = new AutoMark();
        		automark.setId(markId);
        auto.setMark(automark);
        AutoModel automodel = new AutoModel();
        		automodel.setId(modelId);
        auto.setModel(automodel);
        List<AutoOption> options = new ArrayList<>();
        for (Integer id : optionIds) {
            options.add(new AutoOption(){{
                setId(id);
            }});
        }
        auto.setOptions(options);

        return crudService.create(auto).toString();
    }

    @ShellMethod(
            prefix = "--",
            value = "Update auto",
            key = "auto update"
    )
    public String update(
            @ShellOption Integer id, 
			@ShellOption Integer markId,
			@ShellOption Integer modelId,
            @ShellOption Integer[] optionIds) {
        try {
            Auto auto = new Auto();
            auto.setId(id);
            AutoMark automark = new AutoMark();
            		automark.setId(markId);
            auto.setMark(automark);
            AutoModel automodel = new AutoModel();
            		automodel.setId(modelId);
            auto.setModel(automodel);
            List<AutoOption> options = new ArrayList<>();
            for (Integer oid : optionIds) {
                options.add(new AutoOption(){{
                    setId(oid);
                }});
            }
            auto.setOptions(options);

            return crudService.update(auto).toString();
        }
        catch (ModelNotFound e) {
            return "Not found";
        }
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read all values of auto",
            key = "auto readall"
    )
    public Table readAll() {
        return super.readAll();
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read some values of auto with pagination",
            key = "auto readrange"
    )
    public Table readWithLimitAndOffset(
            @ShellOption(
                    help = "Limit for number of returning values"
            ) Integer limit,
            @ShellOption(
                    help = "Offset for number of returning values"
            ) Integer offset
    ) {
        return super.readWithLimitAndOffset(limit, offset);
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read information about auto by id",
            key = "auto read"
    )
    public String read(@ShellOption Integer id) {
        return super.read(id);
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Delete auto by id",
            key = "auto delete"
    )
    public String delete(@ShellOption Integer id) {
        return super.delete(id);
    }
}
