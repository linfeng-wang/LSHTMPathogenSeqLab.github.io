---
layout: default
name: primedRPA, primer design for recombinase polymerase amplification assays
theme: 
  - 
pid: primedrpa
link: https://academic.oup.com/bioinformatics/article/35/4/682/5068159?login=false
people:
  - mhiggins
  - dward
  - jphelan
  - tgclark
  - scampino
  
highlighted: false
---

Recombinase polymerase amplification (RPA), an isothermal nucleic acid amplification method, is enhancing our ability to detect a diverse array of pathogens, thereby assisting the diagnosis of infectious diseases and the detection of microorganisms in food and water. However, new bioinformatics tools are needed to automate and improve the design of the primers and probes sets to be used in RPA, particularly to account for the high genetic diversity of circulating pathogens and cross detection of genetically similar organisms. PrimedRPA is a python-based package that automates the creation and filtering of RPA primers and probe sets. It aligns several sequences to identify conserved targets, and filters regions that cross react with possible background organisms.