---
layout: default
name: TB-ML
theme: tuberculosis
pid: tb-ml
link: none
people:
    - jphelan
    - lwang
highlighted: false
excerpt_separator: "<!--more-->"
---

Motivation: Machine learning (ML) has shown impressive performance in predicting antimicrobial resistance (AMR) from sequence data, including for <i>Mycobacterium tuberculosis</i>, the causative agent of tuberculosis. However, current ML development and publication practices make it difficult for researchers and clinicians to use, test or reproduce published models.

Results: We packaged a number of published and unpublished ML models for predicting AMR of <i>M. tuberculosis</i> into Docker containers. Similarly, the pipelines required for pre-processing genomic data into the formats required by the models were also packaged into separate containers. By following a minimal container I/O standard, we ensured as much interoperability as possible. We also created a command-line application, TB-ML, which can be used to easily combine pre-processing and prediction containers into complete pipelines ready for predicting resistance from novel, raw data with a single command. As long as there is adherence to this minimal standard for the container interface, containers produced by researchers holding new models can likewise be included in these pipelines, making benchmark comparisons of different models simple and facilitating faster uptake in the clinic. 

<!--more-->