package com.pia.carfactory.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnCabrioProducedMessage() throws Exception {
        this.mockMvc.perform(get("/car/produce/cabrio"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Cabrio Car has produced.")));
    }

    @Test
    public void shouldReturnSedanProducedMessage() throws Exception {
        this.mockMvc.perform(get("/car/produce/sedan"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Sedan Car has produced.")));
    }

    @Test
    public void shouldReturnHatcbackProducedMessage() throws Exception {
        this.mockMvc.perform(get("/car/produce/hatchback"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hatchback Car has produced.")));
    }
    @Test
    public void shouldReturnNoCarProducedMessage() throws Exception {
        this.mockMvc.perform(get("/car/produce/null"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("No Car has produced.")));
    }
}
