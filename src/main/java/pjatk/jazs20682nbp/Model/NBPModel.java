package pjatk.jazs20682nbp.Model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class NBPModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "This is an id of the table", required = true, value = "id", example = "1")
    private Long id;
    @Enumerated(EnumType.STRING)
    @ApiModelProperty(notes = "This is a type of exchange", required = true, value = "zloto", example = "Zloto")
    private Zloto zloto;
    @ApiModelProperty(notes = "This is starting date", required = true, value = "date", example = "2020-01-01")
    private Date data_Od;
    @ApiModelProperty(notes = "This is ending date", required = true, value = "date", example = "2020-01-02")
    private Date data_Do;
    @ApiModelProperty(notes = "This is average exchange rate", required = true, value = "double", example = "4.65")
    private double kurs;
    @ApiModelProperty(notes = "This is timestamp", required = true, value = "timestamp", example = "2020-01-01 00:00:00")
    private Timestamp timestamp;

    public NBPModel(Long id, Zloto zloto, Date data_Od, Date data_Do, double kurs, Timestamp timestamp) {
        this.id = id;
        this.zloto = zloto;
        this.data_Od = data_Od;
        this.data_Do = data_Do;
        this.kurs = kurs;
        this.timestamp = timestamp;
    }

    public NBPModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Zloto getZloto() {
        return zloto;
    }

    public void setZloto(Zloto zloto) {
        this.zloto = zloto;
    }

    public Date getData_Od() {
        return data_Od;
    }

    public void setData_Od(Date data_Od) {
        this.data_Od = data_Od;
    }

    public Date getData_Do() {
        return data_Do;
    }

    public void setData_Do(Date data_Do) {
        this.data_Do = data_Do;
    }

    public double getKurs() {
        return kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
