---
layout: default
name: Plasmo View
theme: 
  - malaria
  - software
pid: pview
link: http://pathogenseq.lshtm.ac.uk/plasmoviewlive/
people:
  - mPreston
  - tgclark
---


This tool is provided by the PathogenSeq Group at LSHTM. To find the journal reference and latest information see the PlasmoView page. This is an instance of the GGV tool.
The tool has two views: the matrix view and the map view. The matrix view presents mutation information in matrix form, with information on the axes to orient the variant information. The variant information is represented by four colours for each variant location within each sample. White indicates that the sample matches the malaria 3D7 reference at that position, pink a mixed reading, maroon the alternative allele and grey missing data. The left axis gives the colour coded global location of each sample by continent: the reference and lab samples, West Africa (WAF), East Africa (EAF), Southeast Asia (SEA) and Oceania (OCE). The top axis gives (up to) five information bars: reference nucleotides, gene locations, uniqueness, allele frequency (AF) and Fst. The reference nucleotides are colour coded: A, C, G and T. The gene bar shows: genes, highly variable genes and subtelomeric regions. The MAF and Fst are calculated from the non-reference samples visible, using the continent as the population differentiator in the Weir Fst calculation. These information bars can be turned on and off using the Data interface.
Information on the mutation under the mouse is continually updated in the top-right panel of the screen, including continent, sample id, genomic location, gene id, reference nucleotide, mutation type, amino acid (AA), MAF and Fst. Additionally 'tooltip' style information boxes appear next to the mouse pointer as it is moved around the screen.
The data is navigated by three means: the Data button, the navigation buttons (<, >, Zoom In and Zoom Out) and/or the mouse buttons. The samples, chromosome and gene/region of interest are best selected and controlled through the Data interface. The navigation buttons and mouse controls are best utilised for navigation in and around the currently visible data. The mouse controls can be switched off using the Data interface. The browser history is updated with every change so that previous views can be retrieved and specific views can be bookmarked for later viewing.
Double clicking over a genomic location in the mutation matrix switches the tool to the map view.
The map view uses bar charts placed at the sample collection locations to visualise the global distribution of mutation information for a specific locus. The bar chart colours match those in the mutation matrix and are presented on a logarithmic scale. Holding the mouse over each bar chart provides more information on the proportions of each mutation type. The reference samples are placed over the southern Atlantic. Google Maps is used to render this view.
The Matrix button returns to the last visitied matrix view. 