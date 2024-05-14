package assignmentsAndTasks.src.assignmentsAndTasks.chapter15;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
    private String name;
    private String id;
    private BigDecimal amount;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    private LocalDate date;

        @JsonProperty
    public String getName() {
        return name;
    }
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonProperty
    public String getId() {
        return id;
    }
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }
    @JsonProperty("type")
    public String getType() {
        return type;
    }
@JsonProperty
    public void setType(String type) {
        this.type = type;
    }
@JsonProperty
    public BigDecimal getAmount() {
        return amount;
    }
    @JsonProperty
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    @JsonProperty
    private String type;
}
